package 단계별로_풀어보기.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[][] array = new int[N][2];
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            array[i][0] = Integer.parseInt(stringTokenizer.nextToken());
            array[i][1] = i;
            map.put(i, stringTokenizer.nextToken());
        }
        Arrays.sort(array, Comparator.comparingInt((int[] a) -> a[0]).thenComparing((int[] a) -> a[1]));
        for (int[] i : array) {
            result.append(i[0]).append(" ").append(map.get(i[1])).append("\n");
        }
        System.out.println(result);
    }
}

