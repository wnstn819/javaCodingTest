package ch3_twoPointers;

import java.util.Scanner;

public class t3_1_maxMoney {
    public static void main(String[] args) {
        t3_1_maxMoney T = new t3_1_maxMoney();
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
        int answer = Integer.MIN_VALUE;
        int p1 = 0, p2 = k - 1;
        int sumBf = 0;
        while (p1 + k < n - 1) {
            int sum = sumBf;
            if (p1 == 0) {

                for (int i = 0; i < k; i++) {
                    sum += arr[i];
                }
            } else {
                sum -= arr[p1 - 1];
                sum += arr[p2];
            }

            sumBf = sum;
            p1++;
            p2++;

            if (sum > answer) {
                answer = sum;
            }

        }
        return answer;
    }
}
