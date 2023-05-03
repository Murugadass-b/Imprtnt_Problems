//24
import java.util.*;
public class ArraySearch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to search: ");
        int ele = sc.nextInt();
        boolean found=false;
        int index=0;
        for(int i =0;i<size;i++){
            if(arr[i]==ele){
             found = true;
             index = i;
            }

        }
        if(found){
            System.out.printf("The element %d is found at the index of %d\n",ele,index);
        }
        else{
            System.out.printf("The element %d is not found\n",ele);
        }
        sc.close();
    }
}
