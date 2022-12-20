//카드 게임
package solved.S.S4_2164;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        Queue<Integer> que = new LinkedList<>();

        int m = Integer.parseInt(st.nextToken());
        for (int i = 1; i <= m; i++) {
            que.add(i);
        }

        while (que.size() > 1) {
            que.poll();
            que.add(que.poll());
        }

        sb.append(que.poll());
        System.out.println(sb);

    }
}
