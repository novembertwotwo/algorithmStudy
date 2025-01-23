package 단계별로_풀어보기.집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Set<String> originSet = new HashSet<>();
        int count = 0;
        for (int i = 0; i < N; i++) {
            originSet.add(br.readLine());
        }
        for (int i = 0; i < M; i++) {
            if (originSet.contains(br.readLine())) {
                count += 1;
            }
        }
        System.out.println(count);

    }
}

