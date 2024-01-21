package baekjoon.bronze;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
public class BaekJoon_2455 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int ans = 0;
        int cnt = 0 ; //cnt 값으로 break 할거임

        Integer[]  arr = new Integer[4]; // 4로 정해져있어서 배열 생성
        while(cnt <4){ // 0 , 1 ,2 , 3
            ans -= sc.nextInt(); //처음에 받는 수 빼줌
            ans += sc.nextInt(); //다음 받는 수 더해줌
            arr[cnt] = ans; //cnt 랑 인덱스가 같으므로 배열에 저장
            cnt ++ ; // 1 사이클마다 cnt 증가

        }
        //배열 내림차순
        Arrays.sort(arr , Collections.reverseOrder()); //배열을 오름차순으로 정렬하고 , 뒤집음
        System.out.println(arr[0]); // 인덱스 0 이 제일 큰 수

    }


}