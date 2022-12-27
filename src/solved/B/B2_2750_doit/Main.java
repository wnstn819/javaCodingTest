// 수 정렬하기1
package solved.B.B2_2750_doit;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());

        }

        /**
         * 버블 정렬
         */
        /**
         * for (int i = 0; i < n; i++) {
         for (int j = 0; j < n - 1 - i; j++) {
         if (arr[j] > arr[j + 1]) {
         int temp = arr[j];
         arr[j] = arr[j + 1];
         arr[j + 1] = temp;
         }
         }

         }*/


        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}
