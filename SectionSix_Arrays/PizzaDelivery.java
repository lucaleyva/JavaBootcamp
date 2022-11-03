import java.util.Scanner;

public class PizzaDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many pizza toppings do you want? Type a number (e.g. 1, 2, 3, 4, et cetra)");
        int numToppings = scan.nextInt(); scan.nextLine();
        String[] toppings = new String[numToppings]; 

        System.out.println("Great, enter each topping!");
        for (int i = 0; i < toppings.length; i++) {
            System.out.print(i + ". ");
            toppings[i] = scan.nextLine();
        }
        System.out.println("\nThank you! Here are the toppings you ordered");
        for (int i =0; i <toppings.length; i++) {
            System.out.println(i + ". " + toppings[i]);
        }
        System.out.println("\nYour pizza is on it's way!");
        scan.close();
         
    }
}
