package 단계별로_풀어보기.집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split("");
        Set<String> result = new HashSet<>();
        int n = split.length;
        for (int i = 0; i < n; i++) {
            StringBuilder temp = new StringBuilder();
            for(int j = i;j< n;j++){
                temp.append(split[j]);
                if(!result.contains(temp)){
                    result.add(String.valueOf(temp));
                    System.out.println(result);
                }
            }
        }
        System.out.println(result.size());
    }
}
