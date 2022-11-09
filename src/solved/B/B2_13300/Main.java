package solved.B.B2_13300;/////////////////////////////////////////////////////////////////////////////////////////////

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int people = Integer.parseInt(st.nextToken());
        int max = Integer.parseInt(st.nextToken());
        int count = 0;
        int[][] arr = new int[6][2];
        for (int testCase = 0; testCase < people; testCase++) {
            st = new StringTokenizer(br.readLine());
            int sex = Integer.parseInt(st.nextToken());
            int grade = Integer.parseInt(st.nextToken());
            arr[grade - 1][sex] += 1;
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 2; j++) {
                if (arr[i][j] == 0) {
                    continue;
                }
                if (arr[i][j] % max == 0) {
                    count += arr[i][j] / max;

                } else {
                    count += arr[i][j] / max + 1;

                }

            }

        }
        sb.append(count);

        System.out.println(sb);


    }
}


