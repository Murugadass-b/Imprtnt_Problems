//prblm 6
import java.util.*;
public class Prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int num = sc.nextInt();
        boolean isprime=true;
        if(num<=2){
            isprime =false;//values 2,1,0,-1,-2..... are not prime
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){//if num%2==0 then it si not a prime
                isprime=false;
                break;
            }
        }
        if(isprime){
            System.out.println("The given num is prime");
        }
        else{
            System.out.println("The given number is not a prime");
        }
        sc.close();
    }
}
