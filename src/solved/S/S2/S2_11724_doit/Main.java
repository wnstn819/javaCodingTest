// 연결 요소의 개수 구하기
package solved.S.S2.S2_11724_doit;

import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] check;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());

        check = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        for (int i = 1; i < n + 1; i++) {
            check[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            check[s].add(t);
            check[t].add(s);
        }
        int count = 0;
        for (int i = 1; i < n + 1; i++) {
            if (!visited[i]) {
                count++;
                DFS(i);
            }
        }

        System.out.println(count);


    }

    static void DFS(int v) {
        if (visited[v]) {
            return;
        }
        visited[v] = true;
        for (int i : check[v]) {
            if (visited[i] == false) {
                DFS(i);
            }
        }
    }

}
