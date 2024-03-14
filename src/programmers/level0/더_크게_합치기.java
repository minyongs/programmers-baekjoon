package programmers.level0;

public class 더_크게_합치기 {
    public int solution(int a, int b) {
        int answer = 0;

        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        sb.append(String.valueOf(a));
        sb.append(String.valueOf(b));
        sb2.append(String.valueOf(b));
        sb2.append(String.valueOf(a));

        int a1 = Integer.parseInt(sb.toString());
        int b2 = Integer.parseInt(sb2.toString());

        if(a1>b2){
            answer = a1;
        }else if(a1<b2){
            answer = b2;
        }else{
            answer = a1;
        }
        return answer;
    }
}
