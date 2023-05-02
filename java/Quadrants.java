import java.util.*;
public class Quadrants {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the coordinates X and Y: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x>0 && y>0){
            System.out.println("It lies in the First quadrant");
        }
        else if(x>0&& y<0){
            System.out.println("It lies in the Fourth quadrant");
        }
        else if(x<0 && y>0){
            System.out.println("It lies on the Second quadrant");
        }
        else if(x<0 && y<0){
            System.out.println("It lies in the Third quadrant");
        }
        else if(x==0 && y==0){
            System.out.println("It lies in the origin");
        }
        sc.close();
    }
}
