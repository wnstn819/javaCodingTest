package solved.S.S5.S5_2563;/////////////////////////////////////////////////////////////////////////////////////////////

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(st.nextToken());
        int[][] arr = new int[100][100];
        for (int testcase = 0; testcase < T; testcase++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for (int i = x; i < x + 10; i++) {
                for (int j = y; j < y + 10; j++) {
                    arr[i][j] = 1;
                }
            }
        }
        int result = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (arr[i][j] == 1) {
                    result++;
                }
            }
        }
        sb.append(result);
        System.out.println(sb);


    }
}


