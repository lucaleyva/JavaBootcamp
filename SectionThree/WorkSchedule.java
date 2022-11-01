public class WorkSchedule {
    public static void main(String[] args) {
        int day = 1;   //3rd day of the week...
        boolean holiday = false;
         
        // if it's a holiday, print: "woohoo, no work!");
        // if it's the weekend, print: "it's the weekend, no work!"
        // otherwise, print: "Wake up at 7:00 :( ";

        if (holiday == true) {
            System.out.println("Woohoo, no work");
        } else if (day >= 6 ) {
            System.out.println("It's the weekend, no work!");
        } else {
            System.out.println("Wak up at 7:00 :(");
        }

    }
}
