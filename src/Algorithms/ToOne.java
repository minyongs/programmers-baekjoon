package Algorithms;
import java.util.Scanner;
public class ToOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int cnt = 0;


        while (true) {
        int target =(n/k) * k; // 17/4 * 4 =16 -> 가장 가까운 4의 배수 만들기
        cnt +=( n-target); // 17 -16 =1 -> 몇번 빼야할지 계산
        n= target;

        if(n<k) break;

        cnt += 1; // cnt 1씩 증가시키면서 n을 k로 나누기
        n /= k ;
        }
        cnt +=(n-1); // 더이상 안나눠지니까 1될때까지 빼서 마무리
        System.out.println(cnt);
    }}
