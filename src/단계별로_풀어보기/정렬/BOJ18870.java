package 단계별로_풀어보기.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.module.FindException;
import java.util.*;

public class BOJ18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        br.readLine();
        TreeSet<Integer> set = new TreeSet<>();
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (stringTokenizer.hasMoreTokens()) {
            Integer temp = Integer.valueOf(stringTokenizer.nextToken());
            set.add(temp);
            arrayList.add(temp);
        }
        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for (Integer i : set) {
            map.put(i, index);
            index += 1;
        }
        for (Integer i : arrayList) {
            result.append(map.get(i)).append(" ");
        }
        System.out.println(result);
    }
}

