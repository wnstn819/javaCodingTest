package programmers.lv1.sword;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    public static int Solution(int number, int limit, int power) {
        int answer = 0;

        for (int k = 1; k <= number; k++) {
            int cnt = 0;
            for (int i = 1; i * i <= k; i++) {
                if (i * i == k) {
                    cnt++;
                } else if (k % i == 0) {
                    cnt += 2;
                }
            }
            if (cnt > limit) {
                answer += power;
            } else {
                answer += cnt;
            }
        }


        return answer;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        System.out.println(Solution(a, b, c));

    }
}
