package 단계별로_풀어보기.스택_큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ12789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        Deque<Integer> deque2 = new ArrayDeque<>();
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int now = 1;
        while (stringTokenizer.hasMoreTokens()) {
            deque.offer(Integer.valueOf(stringTokenizer.nextToken()));
        }
        while(!deque.isEmpty()){
            Integer poll = deque.poll();
            if (poll.equals(now)) {
                now += 1;
                while (!deque2.isEmpty() && deque2.peek().equals(now)) {
                    now += 1;
                    deque2.pop();
                }
            } else{
                deque2.push(poll);
            }
        }
        if (deque2.isEmpty()) {
            System.out.println("Nice");
        }else{
            System.out.println("Sad");
        }
    }
}

