package programmers.level1;

public class PnY {

    //내 풀이
    class Solution {
        boolean solution(String s) {
            boolean answer = true;
            int length = s.length(); //s.length()를 저장할 변수 생성
            int cntP = 0; // p나 P 일때의 갯수
            int cntY = 0; // y나 Y 일때의 갯수
            for(int i = 0; i < s.length();i++){ //s.length 길이까지의 반복문
                if(s.charAt(i)=='p' || s.charAt(i)=='P'){//문자열도 charAt(i) 의 인덱스로 찾을 수 있다
                    cntP++;
                }else if(s.charAt(i) == 'y' || s.charAt(i)== 'Y'){
                    cntY++;
                }

            }
            if(cntP == cntY){
                answer = true;
            }else if(cntP != cntY){
                answer = false;
            }else{
                answer = true;
            }

            // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
            System.out.println("Hello Java");

            return answer;
        }
    }

    //다른 사람의 풀이
    class Solution2 {
        boolean solution(String s) {
            s = s.toLowerCase();
            int count = 0;

            for (int i = 0; i < s.length(); i++) {

                if (s.charAt(i) == 'p')
                    count++;
                else if (s.charAt(i) == 'y')
                    count--;
            }

            if (count == 0)
                return true;
            else
                return false;
        }
    }

}
