package 단계별로_풀어보기.약수_배수와_소수_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ4134 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            Long num = Long.parseLong(br.readLine());
            result.append(decimal(num)).append("\n");
        }
        System.out.println(result);
    }
    public static Long decimal(Long num){
        if(num<=2){
            return 2L;
        }
        Long result = num;
        while(true){
            boolean flag = false;
            for (int i = 2; i < Math.sqrt(result) + 1; i++) {
                if (result % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                result += 1;
                continue;
            }
            return result;
        }
    }
}

