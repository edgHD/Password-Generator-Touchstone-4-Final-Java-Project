// Utility class to handle sleep functionality
public class Timer {
    // Method to pause execution for a specified number of milliseconds
    public static void sleep(int milliseconds) {
        try {
            // Pause execution for the given time
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            // Print stack trace if the thread is interrupted
            e.printStackTrace();
        }
    }
}