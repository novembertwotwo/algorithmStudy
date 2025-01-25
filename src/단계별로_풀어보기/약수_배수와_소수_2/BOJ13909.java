package 단계별로_풀어보기.약수_배수와_소수_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ13909 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 0; //창문이 열려있는 개수
        for(int i = 1; i * i <= N; i++) { //제곱수만 카운트
            count++;
        }
        System.out.println(count);


    }
}

