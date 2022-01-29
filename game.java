import java.util.Random;
import java.util.Scanner;

public class game{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Lets play stone paper scissor !");
        
        // 0 for stone
        // 1 for paper
        // 2 for Scissor
        
        System.out.println("Chosse 0 for stone, 1 for paper, 2 for scissor.");
        int userInput = sc.nextInt();
        
        Random random = new Random();
        int computerInput = random.nextInt(3);

        System.out.println("You choose : " + userInput);
        System.out.println("Computer choose : " + computerInput);

        if(userInput == computerInput){
            System.out.println("It's a draw !");
        }
        else if(userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1){
            System.out.println(" You won !");
        }
        else{
            System.out.println(" Better luck next time");
        }
        sc.close();
    }
    
}
