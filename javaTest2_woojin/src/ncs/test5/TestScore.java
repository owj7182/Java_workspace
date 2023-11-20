package ncs.test5;

import java.util.Scanner;

public class TestScore {

    public static void main(String[] args) {
        double[][] scores = new double[3][6];  

        Scanner scanner = new Scanner(System.in);

        
        for (int i = 0; i < 3; i++) {
            System.out.printf("%d번째 학생의 점수를 입력하세요\n", i);
            scores[i][0] = i; 
            for (int j = 1; j <= 3; j++) {
                System.out.printf("%d번째 과목의 점수를 입력하세요: ", j);
                scores[i][j] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < 3; i++) {
            double totalScore = 0;
            for (int j = 1; j <= 3; j++) {
                totalScore += scores[i][j];
            }
            scores[i][4] = totalScore;  
            scores[i][5] = totalScore / 3; 
        }
        
        System.out.println("index\t과목1\t과목2\t과목3\t총점\t평균");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%.0f\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\n", scores[i][0], scores[i][1], scores[i][2], scores[i][3], scores[i][4], scores[i][5]);
        }
    }
}