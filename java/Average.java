//7th
import java.util.Scanner;

public class Average {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num of values to check for average: ");
        int num = sc.nextInt();
        int sum=0;
        int n = num;
        while(n-->0){
            int val = sc.nextInt();
            sum +=val;
        }
        float avg = sum/num ;
        System.out.println("The of the entered num is "+sum+" The average of entered "+num+" numbers is "+avg);
        sc.close();
    }
}
