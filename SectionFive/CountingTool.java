import java.util.Scanner;

public class CountingTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        /*Task 1 – Choose a number

            Ask: Hi Timmy! Choose a number to count to: 

            Make sure Timmy can enter the value BESIDE the question. 
        */

        System.out.print("Hi Timmy! Choose a number to count to: ");
        int choice = scan.nextInt();
        System.out.println("Great! Here's how it's done");

        /* Task 2 – Count from 0 to that number

             Let's say Timmy entered 5, you would display: 0 1 2 3 4 5 

        */
        for (int i = 0; i <= choice; i++){
            System.out.print(i);
        }
        scan.close();
    }
}
