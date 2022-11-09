package solved.B.B1_2669;/////////////////////////////////////////////////////////////////////////////////////////////

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    //git Test3
    static int Sol(int[][] arr) {
        int result = 0;


        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (arr[i][j] > 0) {
                    result++;
                }
            }
        }


        return result;

    }

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[][] arr = new int[100][100];


        for (int i = 0; i < 4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken()), x2 = Integer.parseInt(st.nextToken()), y2 = Integer.parseInt(st.nextToken());

            for (int k = x; k < x2; k++) {
                for (int j = y; j < y2; j++) {
                    arr[k][j] += 1;
                }
            }

        }

        sb.append(Sol(arr));
        System.out.println(sb);


    }
}


