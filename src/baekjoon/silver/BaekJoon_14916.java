package baekjoon.silver;
import java.util.Scanner;
//거스름돈
//5로 최대한 많이 나눌수록 최소 횟수가 나온다
//5로 나누어질때까지 2를 빼서 5로 나눠서 풀었음
public class BaekJoon_14916 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0 ;
        int ans=0;
        int temp ;
        if(n % 5 == 0){ //5 로 나누어떨어지면 정답은 바로 나옴
            ans = n/5;


        }else{
            while (true) {
                n -= 2; // 2로 계속 뺌
                cnt++; // 뺄때마다 cnt(횟수) 증가
                if (n % 5 == 0) { //5로 나누어떨어지면
                    temp = n / 5; // n/5의 값을 temp 에 저장
                    ans = cnt + temp; // 증가한 횟수와 temp를 더한값이 답
                    break;
                }else if (n<0){  // 0보다 작아지면
                    ans = -1; // 거슬러줄수 없으므로 -1 (1,3밖에없는듯)
                    break;
                }
            }

        }
        System.out.println(ans);

    }
}

