//29
import java.util.Scanner;
public class PrimeFactors {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        primeFactors(num);
        sc.close();
    }
    public static boolean isPrime(int n){

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
            return true;
    }

    public static void primeFactors(int n){
        for(int i = 2;i<=n;i++){
            if(isPrime(i)==true){
                int x = n;
                while(x%i==0){
                    System.out.print(i+" ");
                    x/=i;
            }
        }
    }
}
}
