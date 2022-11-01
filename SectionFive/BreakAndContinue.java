public class BreakAndContinue {
  public static void main(String[] args) {
    // System.out.println("Example of 'continue'");
    // for (int i = 0; i <= 10; i++) {
    //   if (i % 2 != 0) {
    //     continue;
    //   }
    //   System.out.println(i);
    // }
    
    // System.out.println("\nExample of 'break'");
    // for (int i = 0; i <= 10; i++) {
    //   if (i % 2 != 0) {
    //     break;
    //   }
    //   System.out.println(i);
    // }

      int number = 0;

      while (true) {
        number++;
        if (number > 5) {
          break;
        }
      }
      System.out.println(number);

  }
}
