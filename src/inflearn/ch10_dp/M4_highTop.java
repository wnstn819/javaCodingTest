package inflearn.ch10_dp;


import java.io.*;
import java.util.*;

class Brick implements Comparable<Brick> {
    public int s, h, w;

    Brick(int s, int h, int w) {
        this.s = s;
        this.h = h;
        this.w = w;

    }

    @Override
    public int compareTo(Brick o) {
        return o.s - this.s;
    }
}

public class M4_highTop {
    static int[] dy;

    public static int Solution(ArrayList<Brick> arr) {
        int answer = 0;
        Collections.sort(arr);
        dy[0] = arr.get(0).h;
        answer = dy[0];

        for (int i = 1; i < arr.size(); i++) {
            int max_h = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (arr.get(j).w > arr.get(i).w && dy[j] > max_h) {
                    max_h = dy[j];
                }
            }
            dy[i] = max_h + arr.get(i).h;
            answer = Math.max(answer, dy[i]);
        }
        return answer;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int m = Integer.parseInt(st.nextToken());
        ArrayList<Brick> arr = new ArrayList<>();
        dy = new int[m];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            arr.add(new Brick(a, b, c));

        }
        System.out.println(Solution(arr));

    }


}
