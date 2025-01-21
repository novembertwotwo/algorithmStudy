package 단계별로_풀어보기.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BOJ11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[][] array = new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            array[i][0] = Integer.parseInt(stringTokenizer.nextToken());
            array[i][1] = Integer.parseInt(stringTokenizer.nextToken());
        }

        Arrays.sort(array, Comparator.comparingInt((int[] a) -> a[1])
                .thenComparing((int[] b)->b[0]));
        for (int[] ints : array) {
            result.append(ints[0]).append(" ").append(ints[1]).append("\n");
        }
        System.out.println(result);

    }
}

