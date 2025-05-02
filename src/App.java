import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter secret word: ");

        String word = scanner.nextLine().toLowerCase();

        boolean isGuessed = false;
        int attempts = 0;
        int maxAttempts = 3;

        List<String> letters = new ArrayList<>();

        System.out.print("Secret word " + word.length() + " letters");

        System.out.println("\nStarting now!!!...");

        while (!isGuessed) {

            System.out.print("Entry letter: ");

            String raw_letter = scanner.nextLine();

            if (raw_letter.length() == 0) {
                continue;
            }

            char letter = raw_letter.charAt(0);

            boolean match = word.contains(String.valueOf(letter));

            if (!match) {
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
            System.out.println("Congratulations!!... The word secret is " + word);
        }

        if (!isGuessed) {
            System.out.println("Game over!");
        }

        scanner.close();
    }
}