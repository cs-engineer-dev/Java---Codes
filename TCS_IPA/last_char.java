/* Write a program to print last digit of every word ina string.
cond = ignore all the digits and whitespaces
 * input = Hey3 java Learners
 * Output = as
 */

import java.util.Scanner;

public class last_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        String[] nstr = str.split(" ");
        for (int i = 0; i < nstr.length; i++) {
            String word = nstr[i];
            char ch = word.charAt(word.length() - 1);
            if (Character.isDigit(ch)) {
                continue;
            }
            System.out.print(ch);
        }

    }

}
