import java.util.Scanner;

//5th prblm
public class OddorEveen {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        if(num == 0)
        System.out.println("0 is neither odd nor even ");
         else if(num%2==0)
        System.out.println("The given num is even");
        else
        System.out.println("The given num is odd");
        
        sc.close();
    }
    
}
