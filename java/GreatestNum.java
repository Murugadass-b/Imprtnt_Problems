//8th
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GreatestNum {
    public static void main(String ars[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num of integers: ");
        int num = sc.nextInt();
        /*int GreatestNum = 0;
        for(int i=1;i<=n;i++){
            int val = sc.nextInt();
            if(val>GreatestNum){
                GreatestNum = val;
            }
        }
        System.out.println("The greatest num is "+GreatestNum);
        sc.close();*/

        // using list
        List<Integer> nums = new ArrayList<>();
        while(num-->0){
            nums.add(sc.nextInt());
        }
        System.out.println(nums);

        int GreatestNum = 0;
        for(int i=0;i<nums.size();i++){
            if(nums.get(i)>GreatestNum){
                GreatestNum = nums.get(i);
            }
        }
        System.out.println(GreatestNum);
        sc.close();

    }
}
