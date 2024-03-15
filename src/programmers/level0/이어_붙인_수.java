package programmers.level0;

public class 이어_붙인_수 {
    public int solution(int[] num_list) {
    int answer = 0;
    StringBuilder sb1 = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();

    for(int i = 0 ; i<num_list.length; i ++){
        if(num_list[i] % 2 == 0){
            sb1.append(String.valueOf(num_list[i]));
        }else{
            sb2.append(String.valueOf(num_list[i]));
        }
    }

    int a = Integer.parseInt(sb1.toString());
    int b = Integer.parseInt(sb2.toString());

    answer = a+b;

    return answer;
}
}
