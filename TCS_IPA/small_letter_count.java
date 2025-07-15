/* input = DataBase
 * output = 6
 */

import java.util.Scanner;

public class small_letter_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                count++;
            }
        }
        System.out.println(count);

    }
}
