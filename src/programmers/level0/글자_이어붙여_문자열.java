package programmers.level0;

public class 글자_이어붙여_문자열 {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i <index_list.length; i++){
            sb.append(my_string.charAt(index_list[i]));
        }
        answer = sb.toString();
        return answer;
    }
}
