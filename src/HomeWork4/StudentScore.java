package HomeWork4;

import java.util.Random;

public class StudentScore {
    public static void main(String[] args) {
        final int STUDENT_COUNT = 10000;
        final int MAX_SCORE = 100;

        int[] scoreCount = new int[MAX_SCORE + 1];

        Random rand = new Random();

        for (int i = 0; i < STUDENT_COUNT; i++) {
            int score = rand.nextInt(MAX_SCORE + 1);
            scoreCount[score]++;
        }

        System.out.println("成绩统计结果（0-100分）:");
        System.out.println("分值\t人数");

        for (int score = 0; score <= MAX_SCORE; score++) {
            if (scoreCount[score] > 0) {
                System.out.println(score + "\t" + scoreCount[score]);
            }
        }
    }
}