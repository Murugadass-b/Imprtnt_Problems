//20
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        while(num>0){
            int dig = num%10;
            sum = sum+dig;
            num/=10;
        }
        System.out.printf("Sum of the digits %d is %d",temp,sum);
        sc.close();
    }
}
