package ch3_twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class t2_1_intersection {
    public static void main(String[] args) {
        t2_1_intersection T = new t2_1_intersection();
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

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int x : T.solution(arr1, arr2, n, m)) {
            System.out.print(x + " ");
        }

    }

    public ArrayList<Integer> solution(int[] arr1, int[] arr2, int n, int m) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < m) {
            if (arr1[p1] == arr2[p2]) {
                answer.add(arr1[p1++]);
                p2++;
            } else if (arr1[p1] < arr2[p2]) p1++;
            else p2++;
        }

        return answer;
    }
}
