import java.util.Random;
import java.util.Scanner;

public class numberGame {
    public static void main(String[] args) {
    Scanner s1 = new Scanner(System.in);
    Random random = new Random();
    int randomNum = random.nextInt(101);

    while(true){
        System.out.println("Enter a number as a guess: (Between 1-100)");
        int guessNum = s1.nextInt();

        if(guessNum == randomNum){
            System.out.println("Correct! You have guessed the correct number!");

        }
        else{
        if(guessNum < randomNum){
            System.out.println("Guess is too low, Try guessing higher.");
        }
        else if(guessNum > randomNum){
            System.out.println("Guess is too high, Try guessing Higher.");
        }
    }

        
    }
    

    }
}
