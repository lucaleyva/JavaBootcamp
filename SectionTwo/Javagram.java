import java.util.Scanner;
import java.util.Locale;

public class Javagram {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);
    System.out.println("Welcome! Thank you for taking the survey.");
    
    int counter = 0;
    System.out.println("\nWhat is your first name?");
    String firstName = scan.nextLine();
    counter++;

    System.out.println("\nWhat is your last name?");
    String lastName = scan.nextLine();
    counter++;
    
    System.out.println("\nWhat is your age?");
    int age = scan.nextInt();
    counter++;

    System.out.println("\nWhat is your username?");
    scan.nextLine();
    String username = scan.nextLine();
    counter++;
    
    System.out.println("\nWhat city do you live in?");
    String city = scan.nextLine();
    counter++;
    
    System.out.println("\nWhat country do you live in?");
    String country = scan.nextLine();
    counter++;

    System.out.println("\nThank you for joining JavaGram!");
    System.out.println("\nThank you for answering all " + counter + " questions!");
    System.out.println("\nHere is the information you entered" + "\n\tFirst Name: " + firstName + "\n\tLast Name: " + lastName + "\n\tAge: " + age + "\n\tUsername: " + username + "\n\tCity: " + city + "\n\tCountry: " + country);

    scan.close();
  }
  

}
