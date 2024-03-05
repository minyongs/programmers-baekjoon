package programmers.level0;

public class 아이스_아메리카노 {
    public int[] solution(int money) {

        int howMany = money/5500;
        int left = money -(5500 * howMany);
        int[] answer = {howMany,left};
        return answer;
    }

}
