package 단계별로_풀어보기.집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        br.readLine();
        Map<Integer, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            Integer num = Integer.valueOf(st.nextToken());
            int temp = map.getOrDefault(num, 0) ;
            map.put(num, temp + 1);
        }
        br.readLine();
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            result.append(map.getOrDefault(Integer.valueOf(st.nextToken()), 0)).append(" ");
        }
        System.out.println(result);
    }
}

