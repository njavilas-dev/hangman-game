import java.util.HashSet;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter secret word: ");

        String word = scanner.nextLine().toLowerCase();

        boolean isGuessed = false;
        int attempts = 0;
        int maxAttempts = 3;

        HashSet<String> letters = new HashSet<>();

        System.out.print("Secret word " + word.length() + " letters");

        System.out.println("\nStarting now!!!...");

        while (!isGuessed) {

            System.out.print("Entry letter: ");

            String raw_letter = scanner.nextLine();

            if (input.length() > 0 || !Character.isLetter(input.charAt(0))) {
                System.out.println("Please enter a single valid letter");
                continue;
            }

            char letter = raw_letter.charAt(0);

            if (!word.contains(String.valueOf(letter))) {
                attempts++;

                if (attempts == maxAttempts) {
                    break;
                }

                System.out.println("Try again... attempts: " + attempts + "/" + maxAttempts);

                continue;
            }

            if (!letters.contains(String.valueOf(letter))) {
                letters.add(String.valueOf(letter));
            }

            int counter = 0;

            for (String i : word.split("")) {

                if (letters.contains(i)) {
                    System.out.print(i + " ");
                } else {
                    System.out.print("-" + " ");

                    counter++;
                }
            }

            if (counter > 0) {
                System.out.println("\nKeep going... ");

                continue;
            }

            isGuessed = true;
        }

        if (isGuessed) {
            System.out.println("\nCongratulations!!... The word secret is " + word);
        }

        if (!isGuessed) {
            System.out.println("Game over!");
        }

        scanner.close();
    }
}
