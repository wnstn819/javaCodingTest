package solved.S.S5.S5_2635;/////////////////////////////////////////////////////////////////////////////////////////////

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static List<Integer> resultList = new LinkedList<>();
    static int max = 0;

    public static void Sol(int T, int a, List list) {
        int num = T - a;

        if (num >= 0) {
            list.add(num);
            Sol(a, num, list);

        } else {

            if (list.size() > max) {
                resultList = list;
                max = resultList.size();
            }
        }


    }


    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(st.nextToken());


        for (int i = T; i > 0; i--) {
            List<Integer> list = new LinkedList<>();

            list.add(T);
            list.add(i);
            Sol(T, i, list);
        }

        sb.append(resultList.size() + "\n");
        for (int i = 0; i < resultList.size(); i++) {
            sb.append(resultList.get(i) + " ");
        }
        System.out.println(sb);


    }
}


