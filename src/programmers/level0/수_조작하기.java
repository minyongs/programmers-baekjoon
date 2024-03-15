package programmers.level0;

public class 수_조작하기 {
    public int solution(int n, String control) {
        int answer = 0;

        char[] ch = control.toCharArray();

        for(int i = 0 ; i < ch.length; i++){
            if(ch[i] == 'w'){
                n = n + 1;
            }else if(ch[i] == 's'){
                n = n - 1;
            }else if(ch[i]=='d'){
                n = n + 10 ;
            }else
                n = n-10;

        }

        answer = n ;
        return answer;
    }
}
