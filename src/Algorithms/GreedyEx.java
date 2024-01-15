package Algorithms;
// 1260 원을 큰 단위의 화폐부터 500 ,100, 50, 10 원 순으로
//동전 거슬러주기
public class GreedyEx {
    public static void main(String[] args) {
        int n= 1260;
        int cnt = 0;
        int[] coinTypes = {500, 100, 50 ,10};  // 동전의 종류

        for(int i = 0; i<4; i ++){ //동전의 갯수만큼 반복
            cnt += n / coinTypes[i]; // i 번째 동전으로 몇번 나누었는지
            n %= coinTypes[i]; // n은 i번째 동전으로 나눈 나머지
        }
        System.out.println(cnt);
    }
}
