public class DocComments {
  
  public static void main(String[] args) {
    
  }
  /**
   * Function name: greet
   * 
   * Inside the function:
   *  1. prints: 'Hi'
   */
  public static void greet(){
    System.out.println("Hi");
  }

  /**
   * Function name: printText
   * @param name (string)
   * @param age (string)
   * 
   * Inside the function:
   *  1. prints: "Hi, I'm <name> and I'm <age> years old."
   */
  public static void printText(String name, String age) {
    System.out.println("Hi, I'm " + name + " and I'm " + age + " years old.");
  }

  /**
   * Function Name: calculateArea
   * @param length (double)
   * @param width (double)
   * @return (double)
   * 
   * Inside the function:
   *  1. calculates the area and returns it.
   */
  public static double calculateArea(double length, double width){
    double area = length * width;
    return area;
  }
}
