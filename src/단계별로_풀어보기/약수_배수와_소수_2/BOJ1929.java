package 단계별로_풀어보기.약수_배수와_소수_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        boolean[] flag = new boolean[M + 1];
        for (int i = 2; i < M + 1; i++) {
            if (flag[i]) {
                continue;
            } else {
                if (i >= N) {
                    result.append(i).append("\n");
                }
                for (int j = i; j < M + 1; j += i) {
                    flag[j] = true;
                }
            }
        }
        System.out.println(result);
    }
}

