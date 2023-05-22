//30
import java.util.Scanner;

public class Power {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double base;
        System.out.print("Enter the value of base:");
        base = sc.nextDouble();
        System.out.print("Enter the value of exponent: ");
        double expo = sc.nextDouble();
        double res = Math.pow(base, expo);
        System.out.println(base+" ^ "+expo+" : "+res);
        sc.close();
    }
}
