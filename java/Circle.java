import java.util.*;

//day 2 progrm
public class Circle{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of radius:");
        int r = sc.nextInt();
        double area = Math.PI*r*r;
        double perimeter  = 2*Math.PI*r;
        System.out.println("The value of area is "+area);
        System.out.println("The value of Perimeter is "+perimeter);
        sc.close();

    }
}
