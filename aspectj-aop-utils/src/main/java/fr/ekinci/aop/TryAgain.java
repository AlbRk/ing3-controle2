package fr.ekinci.aop;

import java.lang.annotation.*;
/**
 * Try again
 *
 * @author Romain ALBERCA
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented

public @interface TryAgain{

    /**
     * Specify exception for which operation should be retried.
     */
    Class exception() default Exception.class;

    /**
     * Sets the number of times to retry the operation. The default of -1 indicates we want to use whatever the global default is.
     */
    int retries() default -1;

}
