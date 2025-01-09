import java.util.Random; // Import Random class for generating random numbers
import java.util.List;

// RandomChoice class to select a random element from a list
public class RandomChoice {
    // Generic method to return a random item from a list
    public static <T> T choice(List<T> items) {
        Random random = new Random(); // Create an instance of Random
        return items.get(random.nextInt(items.size())); // Return a random item from the list
    }
}