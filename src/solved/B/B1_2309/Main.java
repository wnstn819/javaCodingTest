package solved.B.B1_2309;/////////////////////////////////////////////////////////////////////////////////////////////

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int[] dwarf = new int[9];
    static boolean[] visited = new boolean[9];

    public static void Sol(int start, int depth) {

        if (depth == 7) {
            int sum = 0;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 9; i++) {
                if (visited[i]) {

                    sb.append(dwarf[i]).append("\n");
                    sum += dwarf[i];

                }
            }
            if (sum == 100) {
                System.out.println(sb.toString());
                System.exit(0);
            }
        }


        for (int i = start; i < 9; i++) {
            visited[i] = true; // 방문처리
            Sol(i + 1, depth + 1); // 선택한 난쟁이의 수(depth)를 1 증가시기고 재귀호출
            // 재귀호출을 끝내고 다음 연산을 위해 방문 배열의 값을 되돌린다.
            visited[i] = false;
        }


    }


    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int testCase = 0; testCase < 9; testCase++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            dwarf[testCase] = Integer.parseInt(st.nextToken());


        }
        Arrays.sort(dwarf);

        Sol(0, 0);


    }
}


