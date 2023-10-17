import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class vowel {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an String : ");
        String str = scanner.next();

        Set<Character> set = new HashSet<Character>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (isVowel(c)) {
                set.add(c);
            }
        }

        System.out.println("Vowels are:");
        for (Character c : set) {
            System.out.print(" " + c);
        }

        scanner.close();
    }

    public static boolean isVowel(char character) {

        if (character == 'a' || character == 'A' || character == 'e' || character == 'E' ||
                character == 'i' || character == 'I' || character == 'o' || character == 'O' ||
                character == 'u' || character == 'U') {
            return true;
        } else {
            return false;
        }
    }

}
