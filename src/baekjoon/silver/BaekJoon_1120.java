package baekjoon.silver;


import java.util.Scanner;

public class BaekJoon_1120 {
    public static void main(String[] args)   {
        //알파벳을 넣고 빼는건 신경 안써도 됨
        //어짜피 최소의 차이가 되도록 끼워놓고 앞엔 알맞은 알파벳으로 채워넣으면 그만
        Scanner sc= new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        int ans = a.length(); // 초기값 a 의 길이로 그냥 초기화(결국 a 의 길이를 넘을순 없음)
        //a<b
        //b 문자열의 인덱스 0 부터 a 문자열의 길이만큼 같은 알파벳이 있는지 체크
        for(int i = 0; i <= b.length()-a.length(); i ++){
            int cnt = 0; //for 루프 돌때마다 초기화

            for(int j = 0; j<a.length();j++){
                if(a.charAt(j) != b.charAt(i+j)){ //첫번째 루프땐 a 문자열의 인덱스 0이랑 b문자열의 인덱스 0 부터 비교 , 두번째 루프땐 a 문자열의 인덱스 0이랑 b 문자열의 인덱스 1부터 비교 .......
                    cnt ++ ;
                }

            }
            if(ans > cnt){ //cnt 를 최소값으로 만들수 있는 로직
                ans = cnt ;
            }
        }
        System.out.println(ans);
    }
}













