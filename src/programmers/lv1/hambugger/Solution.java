package programmers.lv1.hambugger;

import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> st = new Stack<Integer>();
        for (int x : ingredient) {
            st.push(x);

            if (st.size() >= 4) {
                if (st.get(st.size() - 1) == 1 && st.get(st.size() - 2) == 3 && st.get(st.size() - 3) == 2 && st.get(st.size() - 4) == 1) {
                    answer++;
                    st.pop();
                    st.pop();
                    st.pop();
                    st.pop();
                }
            }
        }

        return answer;
    }
}