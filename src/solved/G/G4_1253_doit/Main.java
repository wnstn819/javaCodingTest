package solved.G.G4_1253_doit;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }
        int count = 0;
        Arrays.sort(arr);

        for (int i = 1; i < n; i++) {
            long m = arr[i];
            int sI = 0;
            int eI = i;
            while (sI < eI) {
                if (arr[sI] + arr[eI] == m) {
                    count++;
                    break;
                } else if (arr[sI] + arr[eI] < m) {
                    sI++;
                } else if (arr[sI] + arr[eI] > m) {
                    eI--;
                }
            }
        }

        System.out.println(count);


    }
}
