import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it's a pangram: ");
        String input = scanner.nextLine();

        if (isPangram(input)) {
            System.out.println("The string is a pangram.");
        } else {
            System.out.println("The string is not a pangram.");
        }

        scanner.close();
    }

    public static boolean isPangram(String input) {

        input = input.toLowerCase();

        
        Set<Character> letters = new HashSet<>();

        
        for (char ch : input.toCharArray()) {

            if (Character.isAlphabetic(ch)) {
                letters.add(ch);
            }
        }

        
        return letters.size() == 26;
    }
}
