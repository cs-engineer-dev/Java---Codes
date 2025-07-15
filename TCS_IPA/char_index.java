/*Example:-
 * String input = Xplore
 * Character input = r
 * Output = 4
 */
import java.util.Scanner;
public class char_index
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        System.out.print("Enter the Character that you want to find: ");
        char ch = sc.next().charAt(0);
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==ch)
            {
                System.out.println(ch+" is at "+i+"th index.");
                break;
            }
        }
    }
}
