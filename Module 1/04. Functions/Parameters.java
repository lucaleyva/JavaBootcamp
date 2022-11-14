public class Parameters {

  public static void main(String[] args) {
    
    calculateArea(2.3, 3.5);
    calculateArea(3.2, 5.5);
    calculateArea(5.3, 7.5);

  }
  
  public static void calculateArea(double length, double width) {
    double area = length * width;
    System.out.println("Area: " + area);

  }

}
