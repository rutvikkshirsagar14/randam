import java.util.Scanner;
import java.util.Random;

public class GuessingGame{

    public static void main(String[] args) {

        int random, guess, attempts;
        Scanner keyboard = new Scanner(System.in);
        Random generator = new Random(); 
        random = generator.nextInt(100) + 1;
        attempts = 1; 

        System.out.print("I am thinking of a number between 0 and 100, what do you think it is?");
          System.out.println("enter the guess number:");
        guess = keyboard.nextInt();
        while (guess != random) {
           // System.out.println("enter the guess number:");
           // guess=Keyboard.nextInt();
           // attempts +=1;
            if (guess > random) {
                System.out.print("Lower!");
                attempts += 1; 
            }
            else {
                System.out.print("Higher!");
                attempts +=1;
            } 
        }

        System.out.print(random + "is the correct answer and it took you" + attempts + "attempts to guess it!");

    }     
} 