import java.util.*;
public class HignCf {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int hcf=0;
        for(int i = 2;i<=b;i++){
            if(a%i==0 && b%i==0){
                hcf =i;
            }
        }
        System.out.println("The HCF of "+a+" and "+b+" is :"+hcf);
        sc.close();
    }
}

