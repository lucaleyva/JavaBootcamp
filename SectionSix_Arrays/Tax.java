import java.util.Arrays;

public class Tax {
    public static void main(String[] args) {
        double[] price = {1.99, 2.99, 3.99, 4.99};
        double[] afterTax = new double[price.length];
        double salesTax = 0.13;

        for (int i = 0; i < afterTax.length; i++) {
            afterTax[i] = price[i] + (price[i] * salesTax);
          }

          System.out.println("The original prices are: " + Arrays.toString(price) );
          System.out.println("\nThe Prices after tax are: " + Arrays.toString(afterTax));

    }
}
