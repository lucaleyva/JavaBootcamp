public class Exams_two {
    public static void main(String[] args) {
        String[] students = {"Malfoy", "Crabbe", "Goyle", "Pansy", "Dean"};
        System.out.println("It's time to take your 5th years exams. Please, take your seats.\n");

        for  (int i = 0; i < students.length; i++) { 
            System.out.println(students[i] + ", you will take seat " + i);
        }
    }
}