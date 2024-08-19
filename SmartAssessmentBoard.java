import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SmartAssessmentBoard {
    private static Map<String, String> statesAndCapitals;

    public static void main(String[] args) {
        initializeQuizData();
        runQuiz();
    }

    private static void initializeQuizData() {
        statesAndCapitals = new HashMap<>();
        // Add state and capital pairs
        statesAndCapitals.put("Andhra Pradesh", "Amaravati");
        statesAndCapitals.put("Bihar", "Patna");
        statesAndCapitals.put("Karnataka", "Bengaluru");
        statesAndCapitals.put("Maharashtra", "Mumbai");
        statesAndCapitals.put("Rajasthan", "Jaipur");
        // Add more states and capitals as needed
    }

    private static void runQuiz() {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the State Capitals Quiz!");
        System.out.println("Identify the capital of the given state.\n");

        for (Map.Entry<String, String> entry : statesAndCapitals.entrySet()) {
            System.out.print("What is the capital of " + entry.getKey() + "? ");
            String answer = scanner.nextLine().trim();

            if (answer.equalsIgnoreCase(entry.getValue())) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect! The correct answer is: " + entry.getValue() + "\n");
            }
        }

        System.out.println("Quiz Over! Your Score: " + score + " out of " + statesAndCapitals.size());
        scanner.close();
    }
}
