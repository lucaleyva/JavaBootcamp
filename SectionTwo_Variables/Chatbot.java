import java.util.Scanner;
import java.util.Locale;

public class Chatbot {
  
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);

    System.out.println("Hello, What is your name?");
    String name = scan.nextLine();

    System.out.println("Hi " + name + "! I'm Javabot. Where are you from?");
    String whereFrom = scan.nextLine();

    System.out.println("I hear it's beautiful at " + whereFrom + "! I'm from a place called Oracle.\nHow old are you?");
    int age = scan.nextInt();

    System.out.println("So you're " + age + ", cool! I'm 400 years old.\nThis means I'm " + (400 / age) + " times older than you.\nEnough about me. What's your favorite language? (Please don't say Python)");
    scan.nextLine();
    String language = scan.nextLine();

    System.out.println(language + ", that's great! Nice chatting with you, " + name + ". I have to log off now. See ya!");

    

  }
  
}
