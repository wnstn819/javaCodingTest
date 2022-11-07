package inflearn.ch2_array;

import java.util.Scanner;

public class c12_2_mentoring {

    public static void main(String[] args) {
        c12_2_mentoring T = new c12_2_mentoring();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println(T.solution(n, m, array));

    }

    public int solution(int n, int m, int[][] arr) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int cnt = 0;
                for (int k = 0; k < m; k++) {
                    int pi = 0, pj = 0;
                    for (int t = 0; t < n; t++) {
                        if (arr[k][t] == i) pi = t;
                        if (arr[k][t] == j) pj = t;
                    }
                    if (pi < pj) cnt++;
                }
                if (cnt == m) {
                    answer++;
                }
            }


        }

        return answer;
    }
}
