//32
import java.util.*;
public class Strong {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        System.out.println((isStrong(num)==num)?"YES":"NO");
        sc.close();

    }

    public static int factorial(int num){
        int fact = 1;
        for(int i =1;i<=num;i++){
            fact *=i;
        }
        return fact;
    }

    public static int isStrong(int num){
        int dig = 0,res =0;
        while(num>0){
            dig = num%10;
            res  += factorial(dig);
            num /=10;
            
        }
        return res;
    }
}
