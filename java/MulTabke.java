//25
import java.util.*;
public class MulTabke {

    public void table(int n){
        for(int i =1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+(n*i));
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();
        MulTabke obj = new MulTabke();
        obj.table(n);
        sc.close();
    }
}
