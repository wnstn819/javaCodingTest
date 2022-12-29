package solved.S.S5.S5_2751;

import java.io.*;
import java.util.*;

public class Main {
    public static int[] arr, tmp;
    public static long result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        arr = new int[n + 1];
        tmp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        mergeSort(1, n);

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }


    }

    public static void mergeSort(int start, int end) {
        if (end - start < 1) {
            return;
        }
        int m = start + (end - start) / 2;

        mergeSort(start, m);
        mergeSort(m + 1, end);
        for (int i = start; i <= end; i++) {
            tmp[i] = arr[i];
        }
        int k = start;
        int index1 = start;
        int index2 = m + 1;
        while (index1 <= m && index2 <= end) {
            if (tmp[index1] > tmp[index2]) {
                arr[k] = tmp[index2];
                k++;
                index2++;
            } else {
                arr[k] = tmp[index1];
                k++;
                index1++;
            }
        }
        while (index1 <= m) {
            arr[k] = tmp[index1];
            k++;
            index1++;
        }
        while (index2 <= end) {
            arr[k] = tmp[index2];
            k++;
            index2++;
        }
    }
}
