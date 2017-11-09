package fr.ekinci.aop;

import lombok.extern.java.Log;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by alb-rk on 09/11/2017.
 */
@Aspect
@Component
@Log
public class TryAgainAspect {
    private static final int DEFAULT_MAX_RETRIES = 10;

    private int maxRetries = DEFAULT_MAX_RETRIES;
    private int order = 1;

    @Around("@annotation(fr.ekinci.aop.TryAgain)")
    public Object performOperation(ProceedingJoinPoint pjp, TryAgain tryAgain) throws Throwable {
        Class exceptionClass = tryAgain.exception();
        int retries = tryAgain.retries();
        if (!(retries > 0)) {
            retries = this.maxRetries;
        }
        log.info(String.format("Attempting operation with potential for %s with maximum %s retries", exceptionClass.getCanonicalName(), Integer.toString(retries)));


        int numAttempts = 0;
        do {
            numAttempts++;
            try {
                return pjp.proceed();
            } catch (Throwable ex) {
                // if the exception is not what we're looking for, pass it through
                if (!exceptionClass.isInstance(ex)) {
                    throw ex;
                }

                // we caught the configured exception, retry unless we've reached the maximum
                if (numAttempts > retries) {
                    log.warning(String.format("Caught %s and exceeded maximum retries (%s), rethrowing.", exceptionClass.getCanonicalName(), Integer.toString(retries)));
                    throw ex;
                }
                log.info(String.format("Caught %s and will retry, attempts: %s", exceptionClass.getCanonicalName(), Integer.toString(numAttempts)));

            }
        } while (numAttempts <= retries);
        // this will never execute - we will have either succesfully returned or rethrown an exception
        return null;
    }

   /* @Override
    public int getOrder() {
        return order;
    }

    /**
     * Allow overriding of the default order.
     *
     * @param order aspect order
     */
    public void setOrder(int order) {
        this.order = order;
    }

    /**
     * Allow overriding of the default maximum number of retries.
     *
     * @param maxRetries maximum number of retries
     */
    public void setMaxRetries(int maxRetries) {
        this.maxRetries = maxRetries;
    }



    /*@Pointcut("@annotation(fr.ekinci.aop.TryAgain)")
    public void tryAgain(ProceedingJoinPoint joinPoint){
        log.info(String.format(joinPoint.getClass().getMethod().getName()));
    }*/
}
