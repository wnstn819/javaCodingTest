package inflearn.ch3_twoPointers;

import java.util.Arrays;
import java.util.Scanner;

public class t1_1_sumArray {
    public static void main(String[] args) {
        t1_1_sumArray T = new t1_1_sumArray();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        for (int x : T.solution(arr1, arr2, n, m)) {
            System.out.print(x + " ");
        }

    }

    public int[] solution(int[] arr1, int[] arr2, int n, int m) {
        int[] answer = new int[n + m];
        System.arraycopy(arr1, 0, answer, 0, n);
        System.arraycopy(arr2, 0, answer, n, m);

        Arrays.sort(answer);

        return answer;

    }
}
