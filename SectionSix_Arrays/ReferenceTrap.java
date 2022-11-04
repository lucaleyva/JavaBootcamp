import java.util.Arrays;

public class ReferenceTrap {
  public static void main(String[] args) {
    /**
     * This commented out code is an example of the Reference Trap
     */
    // String[] staffLastYear = {"Tommy", "Jonny", "Ronny"};
    // String[] staffThisYear = staffLastYear;
    // staffThisYear[1] = "Abby"; // this will result in both arrays being updated -- the reference trap

    // System.out.println(Arrays.toString(staffLastYear)); // [1] will also be a "Abby" and is shouldn't be
    // System.out.println(Arrays.toString(staffThisYear));

    String[] staffLastYear = {"Tommy", "Jonny", "Ronny"};
    String[] staffThisYear = new String[3];
    for (int i = 0; i < staffThisYear.length; i++) {
      staffThisYear[i] = staffLastYear[i];
    }
    
    staffThisYear[1] = "Abby";

    System.out.println(Arrays.toString(staffLastYear)); 
    System.out.println(Arrays.toString(staffThisYear));
  }
}
