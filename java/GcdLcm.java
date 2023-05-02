//17
import java.util.*;
public class GcdLcm {
    public static void main(String args[]){
        int gcd,lcm,a,b;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of first number: ");
        a = sc.nextInt();
        System.out.print("Enter the value of second number: ");
        b = sc.nextInt();
        gcd = findGcd(a, b);
        lcm = (a*b)/gcd;
        System.out.printf("The GCD of %d %d is %d%n",a,b,gcd);
        System.out.printf("The LCM of %d %d is %d%n",a,b,lcm);
        sc.close();
    }

    public static int findGcd(int a,int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}
    
