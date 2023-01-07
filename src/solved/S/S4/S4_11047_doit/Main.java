// 동전 개수의 최솟값 구하기

package solved.S.S4.S4_11047_doit;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Integer[] arr = new Integer[N];
        for (int i = 0; i < N; i++) {

            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr, Collections.reverseOrder());

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            while (K / arr[i] != 0) {
                cnt += K / arr[i];
                K = K % arr[i];

            }
        }

        System.out.println(cnt);


    }
}
