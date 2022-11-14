public class HighScore {
    public static void main(String[] args) {
        int[] scores = {randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber()};
      
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }
        int highScore = 0;
        int seat = 0;

        for (int i = 0; i < scores.length; i++) {
            if(scores[i] > highScore) {
                highScore = scores[i];
                seat = i;
            } 
        }
        System.out.println("\n\nThe highest score is: " + highScore + ". Give that champion a cookie!");
        System.out.println("It's the winner in seat: " + seat + ". That is who has earned the right to eat this cookie!");
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
