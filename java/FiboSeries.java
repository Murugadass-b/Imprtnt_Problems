//27
import java.util.Scanner;

public class FiboSeries {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a+","+b);
        for(int i =2;i<n;i++){
            int nxt = a+b;
            a=b;
            b=nxt;
            System.out.print(","+nxt);
        }
        sc.close();
    }
}
