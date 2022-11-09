package solved.S.S5_2628;/////////////////////////////////////////////////////////////////////////////////////////////

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());


        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());

        int[][] line = new int[T][2];
        int TCount = 0;
        int LCount = 0;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            if (Integer.parseInt(st.nextToken()) == 0) {
                LCount++;
                line[i][0] = Integer.parseInt(st.nextToken());
            } else {
                line[0][i] = Integer.parseInt(st.nextToken());
                TCount++;
            }


        }
        int[][] arr = new int[m + LCount][n + TCount];
        for (int testCase = 0; testCase < T; testCase++) {

            if (line[testCase][0] == 0) {
                System.out.println(line[0][testCase]);
                for (int i = 0; i < n + TCount - 1; i++) {
                    arr[i][line[0][testCase]] += 1;
                }
            } else {
                for (int i = 0; i < m + LCount + 1; i++) {
                    arr[line[testCase][0]][i] += 1;
                }
            }

        }

        for (int i = 0; i < m + LCount; i++) {
            for (int j = 0; j < n + TCount; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }


    }
}


