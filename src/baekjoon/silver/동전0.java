package baekjoon.silver;
//동전 0
//오름차순으로 입력받기 때문에 내림차순으로 바꿔서 ,
//큰 수부터 차례로 나누면 최소값 구할수 있음을 이용하여 해결
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class 동전0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int cnt= 0;
        Integer[] arr = new Integer[n]; // Integer 배열로 n 길이의 배열 생성
        for(int i = 0 ; i < n; i++){
            arr[i] = sc.nextInt(); // n번 저장

        }

        Arrays.sort(arr, Collections.reverseOrder()); // 컬렉션으로 오름차순으로 입력받은 배열 내림차순으로 변경

        for(int i = 0 ; i < n; i ++){//n까지 진행
            if(arr[i]>k){ // 만약 arr[i] 가 k보다 크면
                continue; //나눌수 없으므로 다음 i로
            }else{
                cnt += k / arr[i] ; // cnt에 k를 arr[i]로 나눈 몫 계속 더하기
                k %=  arr[i]; // k는 다시 arr[i]로 나눈 나머지로 초기화
            }
        }
        System.out.println(cnt);

    }



}
