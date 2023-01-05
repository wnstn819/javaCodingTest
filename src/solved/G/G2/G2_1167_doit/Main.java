// 트리의 지름 구하기
package solved.G.G2.G2_1167_doit;

import java.io.*;
import java.util.*;

class Edge {
    int e;
    int value;

    public Edge(int e, int value) {
        this.e = e;
        this.value = value;
    }

}


public class Main {
    static boolean[] visited;
    static ArrayList<Edge>[] list;

    static int[] distance;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();


        int n = Integer.parseInt(st.nextToken());
        list = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            list[i] = new ArrayList<Edge>();
        }
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            while (true) {
                int node = Integer.parseInt(st.nextToken());
                if (node == -1) {
                    break;
                }
                int edge = Integer.parseInt(st.nextToken());
                list[x].add(new Edge(node, edge));
            }

        }
        distance = new int[n + 1];
        visited = new boolean[n + 1];
        BFS(1);

        int Max = 1;
        for (int i = 2; i <= n; i++) {
            if (distance[Max] < distance[i]) {
                Max = i;
            }
        }
        distance = new int[n + 1];
        visited = new boolean[n + 1];
        BFS(Max);
        Arrays.sort(distance);
        System.out.println(distance[n]);


    }

    static void BFS(int index) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(index);
        visited[index] = true;
        while (!queue.isEmpty()) {
            int now_node = queue.poll();
            for (Edge i : list[now_node]) {
                int e = i.e;
                int v = i.value;
                if (!visited[e]) {
                    visited[e] = true;
                    queue.add(e);
                    distance[e] = distance[now_node] + v;
                }
            }
        }

    }

}
