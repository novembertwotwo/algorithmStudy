package 단계별로_풀어보기.집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>();
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        while (stringTokenizer.hasMoreTokens()) {
            set.add(Integer.valueOf(stringTokenizer.nextToken()));
        }
        int M = Integer.parseInt(br.readLine());
        stringTokenizer = new StringTokenizer(br.readLine());
        while (stringTokenizer.hasMoreTokens()) {
            result.append(set.contains(Integer.parseInt(stringTokenizer.nextToken())) ? 1 : 0).append(" ");
        }
        System.out.println(result);
    }
}

