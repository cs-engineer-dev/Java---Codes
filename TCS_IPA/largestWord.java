/* Find Largest word from a given sentence.
 * if two strings have same length then print the first one.
 * input = TCS is the best company ever.
 * output = company
 */

import java.util.Scanner;

public class largestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Sentence: ");
        String str = sc.nextLine();
        String[] nstr = str.split(" ");
        String largest = " ";
        for (int i = 0; i < nstr.length; i++) {
            if (nstr[i].length() > largest.length()) {
                largest = nstr[i];
            }
        }
        System.out.println(largest);

    }

}
