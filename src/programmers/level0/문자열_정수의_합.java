package programmers.level0;

public class 문자열_정수의_합 {
    public int solution(String num_str) {
        int answer = 0;
        int [] arr = new int[num_str.length()];
        int sum = 0 ;
        char[] ch = num_str.toCharArray();


        for(int i = 0 ; i < num_str.length(); i++){
            arr[i] = Integer.parseInt(String.valueOf(ch[i]));
            sum += arr[i];
        }
        answer =sum;
        return answer;
    }
}
