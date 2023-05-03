import java.util.Scanner;

public class PrimeNums {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower limit: ");
        int strt = sc.nextInt();
        System.out.print("Enter the upper limit: ");
        int end = sc.nextInt();
        System.out.println("The prime numbers between "+strt+" and "+end+" are:");
        for(int i = strt;i<=end;i++){
            if(isprime(i)){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
    public static boolean isprime(int num) {
        if(num <2){
            return false;
        }
        for(int i = 2;i<=Math.sqrt(num);i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    
}
