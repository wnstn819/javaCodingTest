package solved.S.S4_2491;/////////////////////////////////////////////////////////////////////////////////////////////

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[T];
        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int max = 1;
        int count = 1;
        for (int i = 0; i < T - 1; i++) {
            if (arr[i] <= arr[i + 1]) count++;
            else count = 1;
            max = Math.max(max, count);
        }

        int count2 = 1;
        for (int i = 0; i < T - 1; i++) {
            if (arr[i] >= arr[i + 1]) count2++;
            else count2 = 1;
            max = Math.max(max, count2);
        }


        sb.append(max + "\n");

        System.out.println(sb);


    }
}


