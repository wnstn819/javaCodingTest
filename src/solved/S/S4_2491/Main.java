package solved.S.S4_2491;/////////////////////////////////////////////////////////////////////////////////////////////

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static List<Integer> resultList = new LinkedList<>();


    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(st.nextToken());


        sb.append(resultList.size() + "\n");
        for (int i = 0; i < resultList.size(); i++) {
            sb.append(resultList.get(i) + " ");
        }
        System.out.println(sb);


    }
}


