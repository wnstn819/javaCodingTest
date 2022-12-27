package solved.S.S4.S4_11399_doit;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        int[] sum = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        sum[0] = arr[0];
        int result = sum[0];
        for (int i = 1; i < n; i++) {
            sum[i] = sum[i - 1] + arr[i];
            result += sum[i];
        }
        System.out.println(result);
    }
}