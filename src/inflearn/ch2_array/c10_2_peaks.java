package inflearn.ch2_array;

import java.util.Scanner;

public class c10_2_peaks {

    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        c10_2_peaks T = new c10_2_peaks();

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
        int answer = 0;


        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (nx >= 0 && nx < n && ny >= 0 && ny < n && arr[i][j] <= arr[nx][ny]) {
                        flag = false;
                        break;
                    }

                }
                if (flag) {
                    answer++;
                }

            }
        }


        return answer;

    }
}
