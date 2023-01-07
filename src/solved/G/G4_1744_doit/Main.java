// 수를 묶어서 최댓값 만들기 - 우선순위 큐

package solved.G.G4_1744_doit;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        PriorityQueue<Integer> inQueue = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> deQueue = new PriorityQueue<>();

        int sum = 0;
        int one = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(br.readLine());

            if (number > 1) {
                inQueue.add(number);
            } else if (number < 1) {
                deQueue.add(number);
            } else {
                one++;
            }
        }

        while (inQueue.size() > 1) {
            int s = inQueue.poll();
            int m = inQueue.poll();
            sum += s * m;
        }
        while (!inQueue.isEmpty()) {
            sum += inQueue.poll();
        }

        while (deQueue.size() > 1) {
            int s = deQueue.poll();
            int m = deQueue.poll();
            sum += s * m;
        }
        while (!deQueue.isEmpty()) {
            sum += deQueue.poll();
        }
        sum += one;

        System.out.println(sum);


    }
}
