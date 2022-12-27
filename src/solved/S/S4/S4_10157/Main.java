package solved.S.S4.S4_10157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int C = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int count = 1;
        int[][] arr = new int[R][C];
        int[] x = {1, 0, -1, 0};
        int[] y = {0, 1, 0, -1};


        int d = 0, z = 0;
        int ob = 0;
        while (count <= n) {
            if (R * C < n) {
                sb.append(0);
                break;
            }
            arr[d][z] = count;
            if (arr[d][z] == n) {
                sb.append((z + 1) + " " + (d + 1));
                count++;

            } else {
                if (d + x[ob] < 0 || z + y[ob] < 0 || d + x[ob] >= R || z + y[ob] >= C || arr[d + x[ob]][z + y[ob]] != 0) {

                    switch (ob) {
                        case 0:
                            ob = 1;
                            break;
                        case 1:
                            ob = 2;
                            break;
                        case 2:
                            ob = 3;
                            break;
                        case 3:
                            ob = 0;
                            break;
                    }
                } else {
                    d += x[ob];
                    z += y[ob];
                    count++;
                }


            }


        }


        System.out.println(sb);


    }
}