//day 3 2nd
import java.util.Scanner;

public class LeapYear {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year to be checked:");
        int yr = sc.nextInt();
        boolean isLeapYear = false;
        if(yr%4==0){
            if(yr%100 == 0){
                if(yr%400==0){
                    isLeapYear = true;//If the year is divisible by both 4 and 100, it is not a leap year, unless...If the year is divisible by 400, it is a leap year.
                }
            }
            else{//it is leap yr if only divided by 4
                isLeapYear =true;
            }
        }
        if (isLeapYear) {
            System.out.println(yr + " is a leap year.");
        } else {
            System.out.println(yr + " is not a leap year.");
        }
        sc.close();
    }
}
