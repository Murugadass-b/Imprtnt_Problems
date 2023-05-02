//19
import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int temp = num;
        int rev=0;
        while(num>0){
        int dig = num%10;
        rev = rev*10+dig;
        num /=10;
        }
        System.out.println((temp==rev)?"The given number is a palindrome." :"The given number is not a palindrome");
        sc.close();
    }
}
