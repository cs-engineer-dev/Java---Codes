/*print the whitespaces in a particular string.
input = Hey i am Aniket.
Output = 3
 */

import java.util.Scanner;

public class count_spaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        int s_count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                s_count++;
            }
        }
        System.out.println(s_count);
    }
}