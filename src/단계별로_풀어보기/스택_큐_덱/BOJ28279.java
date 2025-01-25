package 단계별로_풀어보기.스택_큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ28279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(stringTokenizer.nextToken());
            if (a == 1) {
                Integer b = Integer.valueOf(stringTokenizer.nextToken());
                deque.push(b);
            } else if (a == 2) {
                result.append(deque.isEmpty() ? -1 : deque.pop()).append("\n");
            } else if (a == 3) {
                result.append(deque.size()).append("\n");
            } else if (a == 4) {
                result.append(deque.isEmpty() ? 1 : 0).append("\n");
            } else {
                result.append(deque.isEmpty() ? -1 : deque.peek()).append("\n");
            }
        }
        System.out.println(result);
    }
}

