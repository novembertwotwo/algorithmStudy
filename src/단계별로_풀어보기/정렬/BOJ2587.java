package 단계별로_풀어보기.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class BOJ2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[5];
        int sum = 0;
        for(int i = 0 ;i<5;i++){
            int num = Integer.parseInt(br.readLine());
            array[i] = num;
            sum += num;
        }
        Arrays.sort(array);
        StringBuilder result = new StringBuilder();
        result.append(sum / 5).append("\n");
        result.append(array[2]);
        System.out.println(result);
    }
}
