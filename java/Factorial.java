
import java.util.*;
public class Factorial {
    public int fact(int n){
        if(n==0|| n==1){
            return 1;
        }
        else{
        return  n*fact(n-1);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        Factorial obj = new Factorial();
        System.out.println("The factorial of "+n+" is "+obj.fact(n));
        
        sc.close();
    }
}

