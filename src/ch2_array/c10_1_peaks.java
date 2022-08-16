package ch2_array;

import java.util.Scanner;

public class c10_1_peaks {

    public static void main(String[] args) {
        c10_1_peaks T = new c10_1_peaks();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[n + 2][n + 2];

        for (int i = 0; i < n + 2; i++) {
            for (int j = 0; j < n + 2; j++) {
                if (i == 0 || j == 0 || i == n + 1 || j == n + 1) {
                    array[i][j] = 0;
                } else {
                    array[i][j] = sc.nextInt();
                }

            }


        }


        System.out.print(T.solution(n, array));


    }

    public int solution(int n, int[][] arr) {
        int answer = 0;
        for (int i = 1; i < n - 1; i++) {

            for (int j = 1; j < n - 1; j++) {
                if (arr[i][j] > arr[i - 1][j] && arr[i][j] > arr[i][j - 1] && arr[i][j] > arr[i + 1][j] && arr[i][j] > arr[i][j + 1]) {

                    answer++;
                }

            }
        }


        return answer;

    }
}
