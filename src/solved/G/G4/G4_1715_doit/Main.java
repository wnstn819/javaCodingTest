package solved.G.G4.G4_1715_doit;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int[] num = new int[N];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());

            if (i > 0) {
                num[i] = num[i - 1] + arr[i];
            } else {
                num[0] = arr[0];
            }
        }
        Arrays.sort(arr);

        for (int i = 1; i < N; i++) {
            sum += num[i];
        }

        System.out.println(sum);

    }
}
