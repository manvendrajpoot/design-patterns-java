package main.java.org.manvendra.CreationalDP.SingletonPattern.LoggerExample;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    /*
    * 'volatile' ensures visibility of changes across threads
    * */
    private static volatile Logger instance;

    private final DateTimeFormatter formatter;

    // private constructor
    private Logger() {
        this.formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm::ss");

        System.out.println("Initialising Logger...");
    }

    public static Logger getInstance() {
        if (instance == null) { // first check
            synchronized (Logger.class) {
                if (instance == null) { // second check
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    // Business Logic of log()
    public void log(String msg) {
        String currTime = LocalDateTime.now().format(formatter);
        System.out.println("[" + currTime + "] " + msg);
    }
}
