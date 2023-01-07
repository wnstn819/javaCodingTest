// 카드 정렬하기 - 우선 순위 큐

package solved.G.G4_1715_doit;

import java.io.*;
import java.util.*;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            queue.add(Integer.parseInt(br.readLine()));
        }

        while (queue.size() != 1) { // 1개 남으면 끝난 연산이므로

            int one = queue.poll();
            int two = queue.poll();
            sum += one + two;
            queue.add(one + two);

        }

        System.out.println(sum);

    }
}
