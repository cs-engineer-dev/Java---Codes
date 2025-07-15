/* Enter a string and print all vowel as it is which is available in the string at the 0 index.
 * input = Hello I am a student.
 * output = Iaa
 */

import java.util.Scanner;

public class print_vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        String[] nstr = str.split(" ");
        for (int i = 0; i < nstr.length; i++) {
            String word = nstr[i];
            char ch = word.charAt(0);
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
                    || ch == 'u' || ch == 'U') {
                System.out.print(ch);
            }
        }

    }
}