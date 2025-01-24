package 단계별로_풀어보기.약수_배수와_소수_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2485 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            int now = Integer.parseInt(br.readLine());
            array[i] = now;
        }
        int minValue = 1000000000;
        int[] array2 = new int[N - 1];
        for (int i = 0; i < N - 1; i++) {
            int interval = array[i + 1] - array[i];
            minValue = Math.min(minValue, interval);
            array2[i] = interval;
        }
        int minInterval = 1;

        for (int i = minValue; i > 1; i--) {
            boolean flag = true;
            for (int j : array2) {
                if ( j%i != 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                minInterval = i;
                break;
            }
        }
        int result = 0;
        for (int i : array2) {
            result += ((i / minInterval) - 1);
        }
        System.out.println(result);
    }
}

