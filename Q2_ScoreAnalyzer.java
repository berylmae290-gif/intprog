// TEST 2
import java.util.ArrayList;
import java.util.Scanner;

public class Q2_ScoreAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of student scores to record: ");
        int NumberOfStudentScores = scanner.nextInt();

        ArrayList<Integer> scores = new ArrayList<>();
        for(int aboveAverageCount = 0; aboveAverageCount < NumberOfStudentScores; aboveAverageCount++){
            System.out.print("Enter score for student " + (aboveAverageCount + 1) + ": ");
            int num = scanner.nextInt();
            scores.add(num);
        }

        System.out.println("\n--- Score Analysis Report ---");
        System.out.println("All Scores: " + scores);

        double max = scores.get(0);

        for(int highScore = 1; highScore < scores.size(); highScore++){
            if(scores.get(highScore) > max){
                max = scores.get(highScore);
            }
        }

        double min = scores.get(0);

        for(int lowScore = 1; lowScore < scores.size(); lowScore++){
            if(scores.get(lowScore) < min){
                min = scores.get(lowScore);
            }

        }

        double sum = 0; 
        for (double score : scores){
            sum += score;
        }

        double average = sum / scores.size();

        System.out.println("Highest Score: " + max);
        System.out.println("Lowest Score: " + min);
        System.out.println("Class Average: " + average);

        scanner.close();

    }
}