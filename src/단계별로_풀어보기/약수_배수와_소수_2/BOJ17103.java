package 단계별로_풀어보기.약수_배수와_소수_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ17103 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int maxVal = 1000001;
        boolean[] flag = new boolean[maxVal];
        for (int i = 2; i < maxVal; i++) {
            if(!flag[i]){
                for (int j = i * 2; j<maxVal; j += i) {
                    flag[j] = true;
                }
            }
        }
        for (int i = 0; i < T; i++) {
            int temp = Integer.parseInt(br.readLine());
            int count = 0;
            for (int j = 2; j <= temp / 2; j++) {
                if (!flag[j] && !flag[temp - j]) {
                    count += 1;
                }
            }
            result.append(count).append("\n");
        }
        System.out.println(result);
    }
}

