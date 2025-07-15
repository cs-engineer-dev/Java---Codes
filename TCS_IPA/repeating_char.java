/*Input = Experience
 * Output = Exprinc
 */


import java.util.Scanner;
public class repeating_char
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        String temp = "";
        for(int i=0; i<str.length(); i++)
        {
            if(temp.indexOf(str.charAt(i))==-1)
            {
                temp = temp + str.charAt(i);
            }

        }
        System.out.println(temp);
    }
}