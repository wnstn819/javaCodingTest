package solved.B.B1_14696;/////////////////////////////////////////////////////////////////////////////////////////////

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {

    public static int[] makePaper(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] paper = new int[5];
        int n = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            paper[Integer.parseInt(st.nextToken())] += 1;
        }
        return paper;

    }

    public static String Sol(int[] A, int[] B) {
        String result = "D\n";
        for (int i = 4; i > 0; i--) {
            if (B[i] > A[i]) {
                result = "B\n";
                break;
            } else if (B[i] < A[i]) {
                result = "A\n";
                break;
            }
        }
        return result;

    }


    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(st.nextToken());
        for (int testCase = 0; testCase < T; testCase++) {

            int[] A = makePaper(br);
            int[] B = makePaper(br);


            sb.append(Sol(A, B));

        }


        System.out.println(sb);


    }
}


