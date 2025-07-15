/* Find Characters of a string at odd index.
 * Input = Management
 * Output = aaeet
*/

import java.util.Scanner;
public class odd_index
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        for(int i=0; i<str.length(); i++)
        {
            if(i%2==1)
            {
                System.out.print(str.charAt(i));
            }
        }
    }
}