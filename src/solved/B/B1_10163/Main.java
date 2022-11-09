package solved.B.B1_10163;/////////////////////////////////////////////////////////////////////////////////////////////

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void Sol(int[][] arr, int T) {
        int[] paper = new int[T + 1];
        for (int i = 0; i < 1001; i++) {
            for (int j = 0; j < 1001; j++) {

                paper[arr[i][j]] += 1;
            }

        }
        for (int i = 1; i <= T; i++) {
            sb.append(paper[i] + "\n");
        }


    }


    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());
        int[][] arr = new int[1001][1001];
        for (int testCase = 1; testCase <= T; testCase++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int width = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            for (int i = x; i < x + width; i++) {
                for (int j = y; j < y + height; j++) {
                    arr[i][j] = testCase;
                }
            }


        }


        Sol(arr, T);

        System.out.println(sb);


    }
}


