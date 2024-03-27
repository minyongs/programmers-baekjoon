package programmers.level1;

public class 하샤드수 {
    public boolean solution(int x) {

        //문자열로 저장
        String s = String.valueOf(x);


        //정수로 변환후 배열에 저장후 총합 구하기
        int sum = 0 ;
        for(int i = 0 ; i<s.length(); i++){
            sum += Integer.parseInt(String.valueOf(s.charAt(i)));
        }

        //총 합으로 나누어 떨어지면 true, 그렇지 않으면 false
        if(x%sum == 0){
            return true;
        }else
            return false;

    }
}
