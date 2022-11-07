package inflearn.ch2_array;

import java.util.Scanner;

public class c11_2_classPresident {

    public static void main(String[] args) {
        c11_2_classPresident T = new c11_2_classPresident();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[n + 1][6];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {

                array[i][j] = sc.nextInt();


            }


        }


        System.out.print(T.solution(n, array));


    }

    public int solution(int n, int[][] arr) {
        int answer = 0, max = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= 5; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }

            }
            if (cnt > max) {
                max = cnt;
                answer = i;
            }
        }
        return answer;

    }
}
