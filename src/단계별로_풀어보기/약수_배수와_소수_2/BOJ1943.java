package 단계별로_풀어보기.약수_배수와_소수_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1943 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int min = Math.min(a, b);
            int temp = min;
            while(true){
                if (temp % a == 0 && temp % b == 0) {
                    break;
                }
                temp += min;
            }
            result.append(temp).append("\n");
        }
        System.out.println(result);

    }
}

