import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n****ROYAL BANK OF JAVA****");
        System.out.println("Are you here to get a mortgage? (yes or no)");
        //Task 1 - Pick up the user's decision.
        String mortgageYesNo = scan.next();
        if (mortgageYesNo.equals("yes")){
            System.out.println("\nGreat! In one line" +
            "\nHow much money do you have in your savings?" +
            "\nAnd, how much do you owe in credit card debt?");
            Double savings = scan.nextDouble();
            Double debt = scan.nextDouble();
            
            System.out.println("\nHow many years have you worked for?");
            int workYears = scan.nextInt();

            System.out.println("\nWhat is your name?");
            String username = scan.next();
            
            if (savings >= 10000 && debt <= 4999.99 && workYears >= 2) {
                System.out.println("\nCongratulations " + username + "! You have been approved!");
            } else {
                System.out.println("\nSorry, you are not eligible for a mortgage.");
            }

        } else {
            System.out.println("\nOK. Have a nice day!");
        }
        
        scan.close();
    }
}