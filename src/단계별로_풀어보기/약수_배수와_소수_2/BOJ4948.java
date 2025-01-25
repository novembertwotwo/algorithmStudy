package 단계별로_풀어보기.약수_배수와_소수_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ4948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        int maxVal = 3000000;
        boolean[] flag = new boolean[maxVal];
        for (int i = 2; i < maxVal-1; i++) {
            if (!flag[i]) {
                int temp = i * 2;
                for (int j = temp; j < maxVal-1; j += i) {
                    flag[j] = true;
                }
            }
        }

        while (true) {
            int N = Integer.parseInt(br.readLine());
            if (N == 0) {
                break;
            }
            int count = 0;
            for (int i = N + 1; i <= 2 * N; i++) {
                if (!flag[i]) {
                    count += 1;
                }
            }
            result.append(count).append("\n");

        }
        System.out.println(result);
    }
}

