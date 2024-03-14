package programmers.level0;

public class n번째_원소까지 {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];

        for(int i = 0 ; i < n ; i++){
            answer[i] = num_list[i];
        }
        return answer;
    }
}
