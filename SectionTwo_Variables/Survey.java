import java.util.Scanner;
import java.util.Locale;

public class Survey {
  
  public static void main(String[] args) {
     Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);
     System.out.println("Welcome! Thank you for taking the survey.");
     
     int counter = 0;
     System.out.println("\nWhat is your name?");
     String name = scan.nextLine();
     counter++;
     
     System.out.println("\nHow much money do you spend on coffee? (e.g. 5.00)");
     double coffeePrice = scan.nextDouble();
     counter++;
     
     System.out.println("\nHow much money do your spend on fast food? (e.g. 10.00)");
     double foodPrice = scan.nextDouble();
     counter++;
     
     System.out.println("\nHow many times a week do you buy coffee?");
     int coffeeAmount = scan.nextInt();
     counter++;
     
     System.out.println("\nHow many times a week do you buy fast food?");
     int fastFoodAmount = scan.nextInt();
     counter++;

     System.out.println("\nThank you " + name + " for answering all " + counter + " questions");
     System.out.println("\nYour fast food expenses are " + (foodPrice/coffeePrice) + " times your coffee expenses");
     System.out.println("\nWeekly, you spend $" + (coffeeAmount * coffeePrice) + " on coffee");
     System.out.println("\nWeekly, you spend $" + (fastFoodAmount*foodPrice) + " on fast food");

     scan.close();

  }

}
