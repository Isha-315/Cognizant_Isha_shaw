public class Logger {
    // Step 1: Create a private static instance of Logger
    private static Logger instance;

    // Step 2: Private constructor prevents instantiation from other classes
    private Logger() {
        System.out.println("Logger instance created.");
    }

    // Step 3: Public static method to get the single instance
    public static Logger getInstance() {
        // Lazy initialization
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Sample method to log a message
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
