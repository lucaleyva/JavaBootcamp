public class Championship {
    public static void main(String[] args) {

        int gryffindor = 100;    //gryffindor points
        int ravenclaw = 500;    //ravenclaw points

        int margin = (gryffindor - ravenclaw);

        if (margin >= 300){
            System.out.println("Gryffindor takes the house cup!");
        } else if (margin >1 && margin <= 299) {
            System.out.println("In second place, Gryffindor!");
        } else if (margin < 1 && margin >= -100) {
            System.out.println("In third place, Gryffindor!");
        } else {
            System.out.println("In fourth place, Gryffindor!");
        }
    }
}