public class HighScore {
    public static void main(String[] args) {
        int[] scores = {randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber()};
      
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }
        int highScore = 0;

         /** Task 3
          *  
          *   1. Using a for loop, find the highest score in the array and update the highScore.
          *   2. println("\n\nThe highest score is: <>. Give that man a cookie!");

          */
        for (int i = 0; i < scores.length; i++) {
            if(scores[i] > highScore) {
                highScore = scores[i];
            } 
        }
        System.out.println("\n\nThe highest score is: " + highScore + ". Give that champion a cookie!");
    }
    /** 
     * Function name – randomNumber
     * @return random number (int)
     * 
     * Inside the function
     *  - returns a random number between 0 and 50000
     */
    
    public static int randomNumber() {
        double random = Math.random() * 50000;
        random += 1;
        return (int) random;
    }
}
