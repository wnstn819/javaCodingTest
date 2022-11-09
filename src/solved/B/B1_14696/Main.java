package solved.B.B1_14696;/////////////////////////////////////////////////////////////////////////////////////////////

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {


    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(st.nextToken());
        for (int testCase = 0; testCase < T; testCase++) {
            st = new StringTokenizer(br.readLine());
            Integer[] A = new Integer[Integer.parseInt(st.nextToken())];
            for (int i = 0; i < A.length; i++) {
                A[i] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            Integer[] B = new Integer[Integer.parseInt(st.nextToken())];
            for (int i = 0; i < B.length; i++) {
                B[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(A, Collections.reverseOrder());
            Arrays.sort(B, Collections.reverseOrder());
            int arrayLength = Math.min(A.length, B.length);
            int count = 0;
            for (int i = 0; i < arrayLength; i++) {
                if (A[i] == B[i]) {
                    count++;
                    continue;
                }
                if (A[i] > B[i]) {
                    sb.append("A\n");
                    break;
                } else if (A[i] < B[i]) {
                    sb.append("B\n");
                    break;
                }
            }
            if (count == arrayLength) {
                if (A.length > B.length) {
                    sb.append("A\n");
                } else if (A.length < B.length) {
                    sb.append("B\n");
                } else {
                    sb.append("D\n");
                }
            }

        }


        System.out.println(sb);


    }
}


