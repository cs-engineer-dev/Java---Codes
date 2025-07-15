/* Take an integer as input and calculate the sum of its digit.
 * if the sum is divisible by 3, then print True else False.
 * Input = 123
 * Output = True
 */

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Integers: ");
        int Nums = sc.nextInt();
        int count = 0, x;
        while (Nums != 0) {
            x = Nums % 10;
            count += x;
            Nums = Nums / 10;
        }
        if (count % 3 == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}