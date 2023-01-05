// 원하는 정수 찾기 이진탐색

package solved.S.S4.S4_1920_doit;

import java.io.*;
import java.util.*;

public class Main {

    static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();


        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        Arrays.sort(arr);
        for (int i = 0; i < m; i++) {

            int number = Integer.parseInt(st.nextToken());
            result = 0;
            binaryFind(arr, 0, n - 1, number);
            sb.append(result + "\n");
        }
        System.out.println(sb);


    }

    static void binaryFind(int[] arr, int start, int end, int i) {
        if (start == end) {
            if (arr[start] == i) {
                result = 1;
            }
        } else {
            int mid = (start + end) / 2;
            if (arr[mid] > i) {
                binaryFind(arr, start, mid - 1, i);
            } else if (arr[mid] < i) {
                binaryFind(arr, mid + 1, end, i);
            } else {
                result = 1;
            }
        }

    }
}
