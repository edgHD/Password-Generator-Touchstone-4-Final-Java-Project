import java.util.ArrayList;
import java.util.List;
import java.util.Random; // Import Random class for random number generation

// PasswordGenerator class to generate a random password based on user input
class PasswordGenerator {
    private int length;
    private boolean containsUppercase;
    private boolean containsNumbers;
    private boolean containsSpecialChar;

    // Define character sets for different types of characters
    private String lowerCase = "abcdefghijklmnopqrstuvwxyz";
    private String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String numbers = "0123456789";
    private String specialChar = "!@#$%^&*()_+{}:\"<>?`~[];',./";

    // Constructor to initialize the PasswordGenerator with user preferences
    public PasswordGenerator(int length, boolean containsUppercase, boolean containsNumbers, boolean containsSpecialChar) {
        this.length = length;
        this.containsUppercase = containsUppercase;
        this.containsNumbers = containsNumbers;
        this.containsSpecialChar = containsSpecialChar;
    }

    // Method to generate a random password based on the user's preferences
    public String generatePassword() {
        StringBuilder password = new StringBuilder();
        RandomChoice randomChoice = new RandomChoice(); // Create an instance of RandomChoice for selecting character sets
        List<String> charPool = new ArrayList<>(); // List to store character sets

        // Always include lowercase letters
        charPool.add(lowerCase);

        // Add uppercase letters if the user opted for them
        if (containsUppercase) {
            charPool.add(upperCase);
        }

        // Add numbers if the user opted for them
        if (containsNumbers) {
            charPool.add(numbers);
        }

        // Add special characters if the user opted for them
        if (containsSpecialChar) {
            charPool.add(specialChar);
        }

        // Initialize Random instance to generate random indices
        Random random = new Random();

        // Loop to generate each character of the password
        for (int i = 0; i < length; i++) {
            // Select a random character set from the charPool
            String chars = randomChoice.choice(charPool);
            // Append a random character from the selected character set to the password
            password.append(chars.charAt(random.nextInt(chars.length())));
        }

        // Return the generated password as a string
        return password.toString();
    }
}
