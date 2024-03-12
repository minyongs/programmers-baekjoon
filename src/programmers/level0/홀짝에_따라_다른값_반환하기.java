package programmers.level0;

public class 홀짝에_따라_다른값_반환하기 {
    public int solution(int n) {
        int answer = 0;

        if(n%2 != 0 ){
            for(int i = 1; i <= n; i++){
                if(i%2 != 0){
                    answer += i;
                }
            }
        }else{
            for(int i = 1; i <= n; i++){
                if(i%2 == 0){
                    answer += (i*i);
                }
            }
        }
        return answer;
    }
}
