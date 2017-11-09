package fr.ekinci;

import fr.ekinci.aop.TryAgain;
import lombok.extern.java.Log;

import java.util.Date;

/**
 * Created by alb-rk on 09/11/2017.
 */
@Log
public class TryAgainTest {

    static int retries=1;
    @TryAgain(exception = Exception.class, retries = 1)
    public void Test(){

        /** JE N'ARRIVE PAS A AFFICHIER DANS LE LOGGER */
        retries++;
        log.info(String.format("Essaie numéro: %s",Integer.toString(retries)));
        throw new IllegalStateException();

    }
}
