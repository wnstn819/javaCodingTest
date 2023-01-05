// 미로 탐색하기

package solved.S.S1.S1_2178_doit;

import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int max = Integer.MAX_VALUE;

    static boolean[][] visited;

    static int[][] arr;
    static int N;
    static int M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        visited = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String data = (st.nextToken());
            for (int j = 0; j < M; j++) {
                arr[i][j] = data.charAt(j) - '0';
            }
        }

        BFS(0, 0);
        System.out.println(arr[N - 1][M - 1]);

    }

    static void BFS(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        while (!queue.isEmpty()) {
            int now[] = queue.poll();
            visited[x][y] = true;
            for (int i = 0; i < 4; i++) {
                int v = now[0] + dx[i];
                int w = now[1] + dy[i];
                if (v >= 0 && v < N && w < M && w >= 0) {
                    if (arr[v][w] != 0 && !visited[v][w]) {
                        visited[v][w] = true;
                        arr[v][w] = arr[now[0]][now[1]] + 1;
                        queue.add(new int[]{v, w});
                    }
                }
            }
        }


    }

}
