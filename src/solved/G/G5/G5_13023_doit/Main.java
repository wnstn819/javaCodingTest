// 친구 관계 파악하기
package solved.G.G5.G5_13023_doit;

import java.io.*;
import java.util.*;

public class Main {

    static ArrayList<Integer>[] list;
    static boolean[] visited;
    static boolean arrive;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());

        list = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            list[i] = new ArrayList<Integer>();
        }
        visited = new boolean[n];

        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            list[s].add(t);
            list[t].add(s);
        }

        for (int i = 0; i < n; i++) {
            DFS(i, 1);
            if (arrive)
                break;
        }
        if (arrive) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }


    }

    static void DFS(int v, int depth) {
        if (depth == 5 || arrive) {
            arrive = true;
            return;
        }
        visited[v] = true;
        for (int i : list[v]) {
            if (!visited[i]) {
                DFS(i, depth + 1);

            }
        }
        visited[v] = false;


    }
}
