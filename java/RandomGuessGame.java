//9
import java.util.*;

public class RandomGuessGame{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int magic = random.nextInt(100)+1;
        int guess;
        System.out.println("*****Welcome to the Magic Guess game*****");
        do{
            System.out.print("Guess the magic number (between 1 and 100): ");
            guess = sc.nextInt();
            if(guess<magic){
                System.out.println("Your guess is too low.");
            }
            else if(guess>magic){
                System.out.println("Your guess is too high.");
            }        
        }while(guess != magic);

        System.out.println("Congratulations, you guessed the magic number!\tand the number is "+guess);
    
        sc.close();
    }
}
