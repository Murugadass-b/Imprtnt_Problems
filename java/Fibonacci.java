import java.util.*;
public class Fibonacci {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        int temp1 = 0;
        int temp2 = 1;
        int temp3;
        int count=2;
        System.out.print(temp1+" ");
        System.out.print(temp2+" ");
        while(count <n){
            temp3 = temp1+temp2;
            System.out.print(temp3+" ");
            temp1= temp2;
            temp2 = temp3;
            count++;
        }
        sc.close();
    }
}
