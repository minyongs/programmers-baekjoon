package programmers.level0;

public class 자릿수_더하기 {
    public int solution(int n) {
        int answer = 0;
        String s = Integer.toString(n);

        char[] ch = s.toCharArray();

        for(int i =0 ; i < ch.length;i++){
            answer += ch[i] - '0';
        }
        return answer;
    }
}
