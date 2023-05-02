//day 3 1st
import java.util.Scanner;

public class Swap {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    int a,b;
    System.out.print("Enter the value of First num: ");
    a = sc.nextInt();
    System.out.print("Enter the value of second num: ");
    b = sc.nextInt();
    System.out.println("Before swapping the value of A is "+a+" the value os B is "+b);
    /*By using an temporary variable
    c = a;
    a = b;
    b = c;*/
    //without using third variable

    a = b-a;
    b = b-a;
    a = b+a;
    System.out.println("After swapping the value of A is "+a+" the value os B is "+b);

    //without using third variable

    sc.close();
}
}
