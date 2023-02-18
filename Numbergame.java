import java.util.Scanner;
import java.lang.Math;

public class Numbergame {
    public static void main(String[] args) {
       
        int autonumber = (int) (Math.random() * 50) + 1;
        int number=1;
        
        
        Scanner input = new Scanner(System.in);
		        
       
        System. out.println("I'm thinking of a number between 1 and 50.\nyou have to guess the number");
        System. out.println("Enter a number : ");
            int guess = input.nextInt();
            while (guess!=autonumber) {
             
            
            
             if (guess > autonumber) {
                System.out.println("Your guess is high.\ntry again!");
                  guess = input.nextInt();
                  number++;
            }
            
            else {
                System.out.println("Your guess is low.\ntry again ");
                 guess = input.nextInt();
                  number++;
            }
            
            
        }
    System. out.println("You guessed the number!\nYou win!");
                
		
    }
    }
