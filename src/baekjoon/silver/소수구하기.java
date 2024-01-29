package baekjoon.silver;

import java.util.Scanner;

public class 소수구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = a; i <=b; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }

        }

        //소수를 판별하는 메서드 작성
        public static boolean isPrime(int num){
        if(num<2) return false; //1은 소수 아니다
            //2부터 j의 제곱이 num 이하일때까지 -> 소수는 제곱근까지만 확인하면 된다!!
        for(int j =2; j*j<=num;j++){ //나누어 떨어지는 수가 있으면 소수 아님
            if(num%j==0){
                return false;
            }
        }
        return true; // 없으면 소수
        }
    }




