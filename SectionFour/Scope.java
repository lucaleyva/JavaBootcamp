public class Scope {
  static int dogs = 5;
  
  public static void main(String[] args) {
    System.out.println(dogs);
    someFunction();
  }
  
  /**
   * Function name: someFunction
   * 
   * Inside the function:
   *  1. prints the value of apples (int)
   */
  public static void someFunction(){
    System.out.println(dogs);
  }

}
