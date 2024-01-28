package baekjoon.silver;

import java.util.Scanner;

public class 소수구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = a; i <= b; i++){
            boolean isTrue = true;

           //5
            for(int j = 2;j < i;j++){
                if(i % j == 0){// 5 를 2부터 4까지 나눠봤을때
                    isTrue = false;
                    break;
                }
            }

        }
    }
}
