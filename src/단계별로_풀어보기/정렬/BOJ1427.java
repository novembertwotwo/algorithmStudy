package 단계별로_풀어보기.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BOJ1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = Arrays.stream(br.readLine().split(""))
                .map(Integer::valueOf)
                .sorted(Collections.reverseOrder())
                .map(String::valueOf)
                .reduce("", String::concat);
        System.out.println(result);
    }
}