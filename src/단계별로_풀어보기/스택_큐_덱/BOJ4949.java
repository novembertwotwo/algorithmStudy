package 단계별로_풀어보기.스택_큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class BOJ4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        int index = 0;
        while (true) {
            String s = br.readLine();
            if (s.equals(".")) {
                break;
            }
            Deque<String> deque = new ArrayDeque<>();
            boolean flag = true;
            for (String part : s.split("")) {
                if (part.equals("(")) {
                    deque.push(part);
                } else if (part.equals(")")) {
                    if (deque.isEmpty()) {
                        flag = false;
                        break;
                    } else {
                        if (deque.peek().equals("(")) {
                            deque.pop();
                        } else {
                            flag = false;
                            break;
                        }
                    }
                } else if (part.equals("[")) {
                    deque.push(part);
                } else if (part.equals("]")) {
                    if (deque.isEmpty()) {
                        flag = false;
                        break;
                    } else {
                        if (deque.peek().equals("[")) {
                            deque.pop();
                        } else {
                            flag = false;
                            break;
                        }
                    }
                }
            }
            if (deque.isEmpty() && flag) {
                result.append("yes").append("\n");
            } else {
                result.append("no").append("\n");
            }
        }
        System.out.println(result);
    }
}

