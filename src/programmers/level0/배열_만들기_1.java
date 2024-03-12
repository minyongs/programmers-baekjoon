package programmers.level0;

public class 배열_만들기_1 {
    public int[] solution(int n, int k) {
        int num = n/k;
        int[] answer = new int[num];

        for(int i = 1; i <=num; i++){
            answer[i-1] = i * k;
        }
        return answer;
    }
}
