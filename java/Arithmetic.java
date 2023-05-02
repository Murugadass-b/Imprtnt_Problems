//16
import java.util.Scanner;
public class Arithmetic {
    
    public static void main(String args[]){
        int option,a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values of A and B:");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Choose your operation:\n1-->add\n2-->sub\n3-->mul\n4-->div\n5-->mod");
        option = sc.nextInt();

        switch(option){
            case 1:
            System.out.printf("Addition of %d and %d is %d",a,b,(a+b));
            break;
            case 2:
            System.out.printf("Subtraction of %d from %d is %d",a,b,(a-b));
            break;
            case 3:
            System.out.printf("Multiplication of %d and %d is %d",a,b,(a*b));
            break;
            case 4:
            System.out.printf("Division of %d and %d is %.3f",a,b,((float)a/b));
            break;
            case 5:
            System.out.printf("Remainder of %d and %d is %d",a,b,(a%b));
            break;
            default:
            System.out.printf("Choose an valid option");

        }
        sc.close();
    }
}
