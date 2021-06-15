package com.sapient;

import java.util.logging.Logger;

/**
 * Hello world!
 */
public final class App {

    static Logger log = Logger.getAnonymousLogger();

    public App() {

    }

    public long factorial(int num) {
        long f = 1;
        while (num > 1) {
            f *= num--;
        }
        return f;
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        log.info("Hello World");
    }

}
