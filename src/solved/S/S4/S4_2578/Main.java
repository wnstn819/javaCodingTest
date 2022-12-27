package solved.S.S4.S4_2578;/////////////////////////////////////////////////////////////////////////////////////////////

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr = new int[5][5];


    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();


        int[][] Narr = new int[26][2];
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                Narr[arr[i][j]][0] = i;
                Narr[arr[i][j]][1] = j;
            }
        }
        int test = 0;
        int result = 0;
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 5; j++) {

                int num = Integer.parseInt(st.nextToken());
                arr[Narr[num][0]][Narr[num][1]] = -1;
                test++;
                for (int k = 0; k < 5; k++) {
                    int lcount = 0;
                    int rcount = 0;
                    for (int w = 0; w < 5; w++) {
                        if (arr[k][w] == -1) {
                            lcount++;
                        }
                        if (arr[w][k] == -1) {
                            rcount++;
                        }
                    }
                    if (lcount == 5) {
                        result++;
                    }
                    if (rcount == 5) {
                        result++;
                    }
                }
                int count = 0;
                int dcount = 0;
                for (int k = 0; k < 5; k++) {

                    if (arr[k][k] == -1) {
                        count++;
                    }

                    if (arr[k][4 - k] == -1) {
                        dcount++;
                    }


                }
                if (count == 5) {

                    result++;
                }

                if (dcount == 5) {
                    result++;
                }
                if (result >= 3) {
                    sb.append(test);
                    break;
                }


                result = 0;
            }
            if (result >= 3) {
                break;
            }


        }


        System.out.println(sb);


    }
}


