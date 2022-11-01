import java.util.Scanner;

public class Delimeters {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in); 
    System.out.println("Enter two integers (on the same line)");
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();

    System.out.println("Enter two very big integers (on the same line)");
    long bigNum1 = scan.nextLong();
    long bigNum2 = scan.nextLong();

    System.out.println("Enter two decimals (on the same line)");
    double decimal1 = scan.nextDouble();
    double decimal2 = scan.nextDouble();

    System.out.println("Enter two text values (on the same line)");
    String text1 = scan.next();
    String text2 = scan.next(); 

    // System.out.println("Enter two integers (on the same line)");
    // String num1 = scan.nextLine();
    // String num2 = scan.nextLine();

    // System.out.println("Enter two very big integers (on the same line)");
    // String bigNum1 = scan.nextLine();
    // String bigNum2 = scan.nextLine();

    // System.out.println("Enter two decimals (on the same line)");
    // String decimal1 = scan.nextLine();
    // String decimal2 = scan.nextLine();

    // System.out.println("Enter two text values (on the same line)");
    // String text1 = scan.nextLine();
    // String text2 = scan.nextLine(); 

    // scan.close();

    // System.out.println("\tIntegers: " + num1 + " " + num2);
    // System.out.println("\tVery Big Numbers: " + bigNum1 + " " + bigNum2);
    // System.out.println("\tDecimals: " + decimal1 + " " + decimal2);
    // System.out.println("\tText Values: " + text1 + " " + text2);

    // System.out.println("Please enter a number");
    // int num = scan.nextInt();

    // scan.nextLine(); //without this the next line will not be read
    // System.out.println("Please write a message");
    // String sentence = scan.nextLine();

    // scan.close();
  }
}
