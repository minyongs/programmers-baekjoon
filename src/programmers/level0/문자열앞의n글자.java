package programmers.level0;

public class 문자열앞의n글자 {
    public String solution(String my_string, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < n ; i++){
            sb.append(my_string.charAt(i));
        }

        answer =sb.toString();
        return answer;
    }
}
