package 단계별로_풀어보기.집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        TreeSet<String> set1 = new TreeSet<>();
        Set<String> set2 = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set1.add(br.readLine());
        }
        for (int i = 0; i < M; i++) {
            set2.add(br.readLine());
        }
        set1.retainAll(set2);
        result.append(set1.size()).append("\n");

        for (String s : set1) {
            result.append(s).append("\n");
        }
        System.out.println(result);
    }
}

