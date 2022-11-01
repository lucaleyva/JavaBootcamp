import java.util.Scanner;

public class Guess  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String secret = " ";

        System.out.print("I chose a number between 1 and 5. Try to guess it: ");

        /* Task 2 
            1. Set up a loop that keeps running while the user is incorrect
               Every time they get it wrong, write 'Guess again: '

            2. Once they guess it, print: You got it!
        */
        
     
        while (!secret.equals("3")){
            secret = scan.nextLine();
        }
        scan.close();
    }

}
