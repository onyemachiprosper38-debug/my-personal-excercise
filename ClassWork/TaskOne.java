public class TaskOne {
    public static void main(String[] args) {
        int[] scores = {74, 94, 77, 75, 37, 74, 82, 59, 75, 97};
        for (int count = 0; count < scores.length; count++) {
            System.out.println("Score " + (count + 1) + ": " + scores[count]);
        }
    }
}
