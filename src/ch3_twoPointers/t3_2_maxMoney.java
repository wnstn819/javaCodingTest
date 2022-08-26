package ch3_twoPointers;

import java.util.Scanner;

public class t3_2_maxMoney {
    public static void main(String[] args) {
        t3_2_maxMoney T = new t3_2_maxMoney();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }

        System.out.print(T.solution(arr, n, k));
    }

    public int solution(int[] arr, int n, int k) {
        int answer, sum = 0;
        for (int i = 0; i < k; i++) sum += arr[i];
        answer = sum;
        for (int i = k; i < n; i++) {
            sum += (arr[i] - arr[i - k]);
            answer = Math.max(answer, sum);
        }


        return answer;
    }
}
