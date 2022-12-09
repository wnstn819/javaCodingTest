package programmers.lv1.foodFight;

//푸드 파이트 대회

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    public static String Solution(int[] food) {
        String answer = "";
        String prefix = "";
        String behind = "";
        for (int i = 1; i < food.length; i++) {
            if (food[i] % 2 != 0) {
                food[i] -= 1;
            }
            for (int j = 0; j < food[i] / 2; j++) {
                prefix = prefix + i;
                behind = i + behind;
            }
        }
        answer = prefix + "0" + behind;
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] food = new int[4];

        for (int i = 0; i < 4; i++) {
            food[i] = Integer.parseInt(st.nextToken());

        }

        System.out.println(Solution(food));

    }
}
