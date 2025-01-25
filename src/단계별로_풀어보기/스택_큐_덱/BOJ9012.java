package 단계별로_풀어보기.스택_큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            Deque<String> deque = new ArrayDeque<>();
            boolean flag = true;
            String[] split = br.readLine().split("");
            for (String s : split) {
                if (s.equals("(")) {
                    deque.push(s);
                } else {
                    if(deque.isEmpty()){
                        flag = false;
                        break;
                    }
                    deque.pop();
                }
            }
            if (deque.isEmpty() && flag) {
                result.append("YES").append("\n");
            } else {
                result.append("NO").append("\n");
            }
        }
        System.out.println(result);
    }
}

