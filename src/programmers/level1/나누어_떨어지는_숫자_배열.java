package programmers.level1;

import java.util.Arrays;

public class 나누어_떨어지는_숫자_배열 {
    public int[] solution(int[] arr, int divisor) {
        //arr 배열중 divisor로 나누어 떨어지는 수 추출
        //배열의 크기가 되는 index 결정
        int index = 0 ;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                index++;
            }
        }
        Integer[] answer1 = new Integer[index];
        for(int i = 0 ;i <arr.length; i++){
            if(arr[i]%divisor ==0){
                answer1[i] = arr[i];
            }
        }
        Arrays.sort(answer1);
        int[] answer = new int[answer1.length];
        for(int i = 0 ; i < answer1.length;i++){
            answer[i] = answer1[i];
        }


        return answer;
    }
}
