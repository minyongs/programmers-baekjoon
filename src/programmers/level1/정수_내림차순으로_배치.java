package programmers.level1;

import java.util.Arrays;
import java.util.Collections;

public class 정수_내림차순으로_배치 {
    public long solution(long n) {
        long answer = 0;

        String s = String.valueOf(n);
        Integer[] arr = new Integer[s.length()];

        for(int i = 0 ; i<s.length();i++){
            arr[i] = s.charAt(i) - '0';
        }
        Arrays.sort(arr, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i< arr.length; i++){
            sb.append(String.valueOf(arr[i]));

        }
        answer = Long.parseLong(sb.toString());



        return answer;
    }
}
