package 단계별로_풀어보기.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        TreeSet<String> set = new TreeSet<>((o1, o2) -> {
            if (o1.length() != o2.length()) {
                return Integer.compare(o1.length(), o2.length());
            }else{
                return o1.compareTo(o2);
            }
        });
        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }
        for (String s : set) {
            result.append(s).append("\n");
        }
        System.out.println(result);
    }
}

