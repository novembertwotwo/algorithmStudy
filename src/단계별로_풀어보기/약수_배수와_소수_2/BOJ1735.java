package 단계별로_풀어보기.약수_배수와_소수_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1735 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int min = Math.min(b, d);

        int temp = min;

        while(true){
            if (temp % b == 0 && temp % d == 0) {
                break;
            }
            temp += min;
        }
        int denominator = a * (temp / b) + c * (temp / d);
        for (int i = Math.min(denominator, temp); i > 1; i--) {
            if (denominator % i == 0 && temp % i == 0) {
                denominator /= i;
                temp /= i;
                break;
            }
        }
        result.append(denominator).append(" ").append(temp);
        System.out.println(result);
    }
}

