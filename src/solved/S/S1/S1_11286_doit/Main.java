// 절댓값 힙

package solved.S.S1.S1_11286_doit;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> list = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (Math.abs(o1) == Math.abs(o2)) {
                    return o1 > o2 ? 1 : -1;
                } else {
                    return Math.abs(o1) - Math.abs(o2);
                }

            }
        });

        int n = Integer.parseInt(st.nextToken());
        for (int t = 0; t < n; t++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                if (!list.isEmpty()) {
                    System.out.println(list.poll());
                } else {
                    System.out.println(0);
                }

            } else {
                list.add(num);
            }
        }

    }
}
