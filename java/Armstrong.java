import java.util.Scanner;

public class Armstrong {
    int len;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the number:");
        System.out.print("Enter the range: ");
        int low = sc.nextInt();
        int high = sc.nextInt();
        //int num = sc.nextInt();
        Armstrong obj = new Armstrong();
        //obj.len = obj.order(num);
        /*if(obj.armstrong(num,obj.len)==num){
            System.out.println("The given number is a Armstrong number ");
        }
        else{
            System.out.println("The given number is not a Armstrong number ");
        }*/
        for(int i = low;i<=high;i++){
            obj.len = obj.order(i);
            if(obj.armstrong(i,obj.len)==i){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }

    public int order(int x){
        len=0;
        while(x!=0){
            len++;
            x=x/10;
        }
        return len;
    }
    public int armstrong(int i,int len){
        int temp=i,sum=0,digit=0;

        while(temp!=0){
            digit = temp%10;
            sum = sum+(int)Math.pow(digit,len);
            temp/=10;
        }
        return sum;
        
    }
}
