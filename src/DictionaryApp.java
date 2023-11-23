import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryApp {
    public static void main(String[] args) {
        // Create a dictionary of words and definitions using a HashMap
        Map<String, String> dictionary = getStringStringMap();

        Scanner userInput = new Scanner(System.in);

        // Display a welcome message
        System.out.println("Welcome to the Dictionary App!");

        // Loop until the user enters 'exit'
        while (true) {
            // Prompt the user to enter a word or 'exit' to quit
            System.out.print("Enter a word (or 'exit' to quit): ");
            String input = userInput.nextLine();

            // Check if the user wants to exit
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            }

            // Look up the word in the dictionary and get the definition
            String definition = dictionary.get(input.toLowerCase());

            // Display the definition or a message if the word is not found
            if (definition != null) {
                System.out.println("Definition: " + definition);
            } else {
                System.out.println("Word not found in the dictionary.");
            }
            System.out.println();  // Add a newline for better formatting
        }
        userInput.close(); // Close the Scanner object
    }

    private static Map<String, String> getStringStringMap() {
        Map<String, String> dictionary = new HashMap<>();

        // Populate the dictionary with some initial entries
        dictionary.put("java", "A high-level, class-based, object-oriented programming language.");
        dictionary.put("python", "An interpreted, high-level, general-purpose programming language.");
        dictionary.put("algorithm", "A step-by-step procedure or formula for solving a problem.");
        dictionary.put("string", "A sequence of characters.");
        dictionary.put("list", "An ordered collection of items.");
        return dictionary;
    }
}
