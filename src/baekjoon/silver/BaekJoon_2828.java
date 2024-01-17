package baekjoon.silver;

import java.util.Scanner;

//사과가 바구니보다 왼쪽 혹은 오른쪽 에 떨어지면 ,맨끝 인덱스의 바구니가 거기까지만 이동하면 최소로 이동할 수 있다
public class BaekJoon_2828 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int gameSize = sc.nextInt();
        int basket = sc.nextInt();
        int howMany =sc.nextInt();
        int cnt =0;
        // 바구니는 인덱스 0부터 m-1 까지의 자리를 차지한다
        int left = 0, right = left + basket -1; // 바구니의 인덱스

        for(int i = 0 ; i < howMany;i++){
            int where = sc.nextInt()-1; // 사과가 어디에 떨어질지
            //인덱스는 0부터 시작하므로 -1 해줘야 한다

            if(where<left){ //사과가 바구니보다 왼쪽에 떨어지면
                int diff = left - where; //사과까지의 거리
                cnt += diff; // 변수에 더해줌
                left -= diff; //인덱스 이동
                right -= diff; // 인덱스 이동
            }else if(right<where){
                int diff = where - right;

                cnt += diff;
                right += diff;
                left += diff;
            }
        }
        System.out.println(cnt);




    }
}