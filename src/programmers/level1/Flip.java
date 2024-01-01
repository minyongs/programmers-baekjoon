package programmers.level1;

import java.util.Arrays;
//내 풀이
public class Flip {

    public int[] solution(long n) {
        String numToString = Long.toString(n); // n 을 문자열로 변환

        int[] answer = new int [numToString.length()]; // 문자열의 길이 크기의 int 배열 생성

        for(int i = 0, j = numToString.length()-1; i < numToString.length()&& j  >= 0 ; i++,j--) {
            answer[i] = numToString.charAt(j) - '0'; // 교차해서 for문
        }
        return answer;



    }

}




