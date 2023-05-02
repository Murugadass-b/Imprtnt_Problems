//14
import java.util.Scanner;
public class AlphaNumeric {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character:");
        String s = sc.nextLine();
        char c = s.charAt(0);
        if(Character.isDigit(c)){
            System.out.println("Yes.It is a digit.");
        }
        else if(Character.isAlphabetic(c)){
            System.out.println("Yes.It is an alphabet.");
        }
        else{
            System.out.println("It is neither a digit nor an alphabet.");
        }
        sc.close();
    }
}
