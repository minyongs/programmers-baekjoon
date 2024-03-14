package programmers.level0;

public class 길이에_따른_연산 {
    public int solution(int[] num_list) {
        int answer = 0;
        int num =1 ;
        if(num_list.length>=11){
            for(int i = 0 ; i < num_list.length; i++){
                answer += num_list[i];
            }
        }else if(num_list.length<=10){
            for(int i = 0 ; i <num_list.length; i++){
                num *= num_list[i];
                answer =num;
            }
        }
        return answer;
    }
}
