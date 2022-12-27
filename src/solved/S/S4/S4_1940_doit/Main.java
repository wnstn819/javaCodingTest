package solved.S.S4.S4_1940_doit;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int sIndex = 0;
        int eIndex = m - 1;
        int result = 0;
        Arrays.sort(arr);

        while (sIndex < eIndex) {
            if (arr[sIndex] + arr[eIndex] == n) {
                result++;
                sIndex++;
                eIndex--;
            } else if (arr[sIndex] + arr[eIndex] < n) {
                sIndex++;
            } else {
                eIndex--;
            }
        }

        System.out.println(result);


    }
}
