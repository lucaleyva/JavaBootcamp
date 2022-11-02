import java.util.Scanner;

public class Grocer1 {
    public static void main(String[] args) {
        
        String[] items = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        System.out.println("\nDo you sell coffee?");

        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("coffee")){
                System.out.println("\nWe have that in ailse: " + i);
                break;
            }
        }
  
    }
}
