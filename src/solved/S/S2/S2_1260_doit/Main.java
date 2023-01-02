// DFS와 BFS

package solved.S.S2.S2_1260_doit;

import java.io.*;
import java.util.*;

public class Main {

    static ArrayList<Integer>[] list;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();


        int n = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        list = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 1; i <= e; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            list[s].add(t);
            list[t].add(s);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(list[i]);
        }
        DFS(start);
        System.out.println();
        visited = new boolean[n + 1];
        BFS(start);
        System.out.println();


    }

    static void DFS(int v) {
        System.out.print(v + " ");
        visited[v] = true;
        for (int i : list[v]) {
            if (!visited[i]) {
                DFS(i);
            }
        }

    }

    static void BFS(int v) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(v);
        visited[v] = true;

        while (!queue.isEmpty()) {
            int now = queue.poll();
            System.out.print(now + " ");
            for (int i : list[now]) {
                if (!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }

    }
}
