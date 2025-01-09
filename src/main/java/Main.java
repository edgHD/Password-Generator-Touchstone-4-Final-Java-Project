/*
  Made by edgHD
  Touchstone 4: Final Java Project
*/

import java.util.Scanner; // Importing the Scanner module for user input

public class Main {
    public static void main(String[] args) {
        // Display ASCII art for the application title
        System.out.println(" ____                                     _    ");
        System.out.println("|  _ \\ __ _ ___ _____      _____  _ __ __| |   ");
        System.out.println("| |_) / _` / __/ __\\ \\ /\\ / / _ \\| '__/ _` |   ");
        System.out.println("|  __/ (_| \\__ \\__ \\\\ V  V / (_) | | | (_| |   ");
        System.out.println("|_|___\\__,_|___/___/ \\_/\\_/ \\___/|_|  \\__,_|   ");
        System.out.println(" / ___| ___ _ __   ___ _ __ __ _| |_ ___  _ __ ");
        System.out.println("| |  _ / _ \\ '_ \\ / _ \\ '__/ _` | __/ _ \\| '__|");
        System.out.println("| |_| |  __/ | | |  __/ | | (_| | || (_) | |   ");
        System.out.println(" \\____|\\___|_| |_|\\___|_|  \\__,_|\\__\\___/|_|   ");
        System.out.println();

        // Pause for 3 seconds to display the banner
        Timer.sleep(3000);

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask for password length with a default value
        int lengthInput = 8; // default length
        System.out.print("Please enter the length of your password [Default = 8]:");
        String lengthInputStr = scanner.nextLine();
        if (!lengthInputStr.isEmpty()) {
            lengthInput = Integer.parseInt(lengthInputStr);
        }

        // Ask if the user wants to include uppercase letters, default is yes
        boolean upperCaseInput = true; // default include uppercase
        System.out.print("Do you want to include uppercase letters? [Default = Yes]:");
        String upperCaseStr = scanner.nextLine().toLowerCase();
        if (upperCaseStr.equals("no") || upperCaseStr.equals("n")) {
            upperCaseInput = false;
        }

        // Ask if the user wants to include numbers, default is yes
        boolean numbersInput = true; // default include numbers
        System.out.print("Do you want to include numbers? [Default = Yes]:");
        String numbersStr = scanner.nextLine().toLowerCase();
        if (numbersStr.equals("no") || numbersStr.equals("n")) {
            numbersInput = false;
        }

        // Ask if the user wants to include special characters, default is yes
        boolean specialCharactersInput = true; // default include special characters
        System.out.print("Do you want to include special characters? [Default = Yes]:");
        String specialCharactersStr = scanner.nextLine().toLowerCase();
        if (specialCharactersStr.equals("no") || specialCharactersStr.equals("n")) {
            specialCharactersInput = false;
        }

        // Create an instance of PasswordGenerator with user inputs
        PasswordGenerator generator = new PasswordGenerator(lengthInput, upperCaseInput, numbersInput,
                specialCharactersInput);

        // Generate the password using the specified parameters
        String newPassword = generator.generatePassword();

        // Display the generated password
        System.out.println("\nYour new password is: " + newPassword);

        // Close the scanner
        scanner.close();
    }
}