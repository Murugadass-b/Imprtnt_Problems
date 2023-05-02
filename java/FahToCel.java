import java.util.Scanner;

public class FahToCel{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit: ");
        float fahrenheit = sc.nextFloat();
        float celcius = ((fahrenheit-32)*5)/9;
        System.out.println("The equivalent Temperarture in celcius is "+celcius);
        sc.close();
    }
}