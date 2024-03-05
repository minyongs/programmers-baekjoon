package programmers.level0;

public class 순서쌍의_개수 {
    // 그냥 1부터 n 까지 나누어떨어지는 숫자 개수 다 구하면 됨
    public int solution(int n) {
        int answer = 0;
        int cnt = 0 ;
        for(int i = 1; i <= n ; i++){
            if(n% i== 0){

                cnt ++  ;

            }
        }
        answer = cnt;
        return answer;
    }
}
