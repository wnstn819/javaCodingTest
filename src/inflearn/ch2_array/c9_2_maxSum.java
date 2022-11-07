package inflearn.ch2_array;

import java.util.Scanner;

public class c9_2_maxSum {

    public static void main(String[] args) {
        c9_2_maxSum T = new c9_2_maxSum();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = sc.nextInt();
            }


        }


        System.out.print(T.solution(n, array));


    }

    public int solution(int n, int[][] arr) {
        int answer = Integer.MIN_VALUE;
        int sum1, sum2; // 1 = 행의 합 2= 열의 합
        for (int i = 0; i < n; i++) {
            sum1 = sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += arr[i][j]; //행 고정
                sum2 += arr[j][i]; //열 고정
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }
        // 두 대각선의 합
        sum1 = sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][n - i - 1];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;

    }
}
