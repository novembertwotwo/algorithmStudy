package 단계별로_풀어보기.집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());
        stringTokenizer = new StringTokenizer(br.readLine());
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        while(stringTokenizer.hasMoreTokens()){
            set.add(Integer.valueOf(stringTokenizer.nextToken()));
        }
        stringTokenizer = new StringTokenizer(br.readLine());
        while(stringTokenizer.hasMoreTokens()){
            set2.add(Integer.valueOf(stringTokenizer.nextToken()));
        }
        set.retainAll(set2);
        System.out.println(a + b - 2 * set.size());
    }
}

