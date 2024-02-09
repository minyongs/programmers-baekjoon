package baekjoon.bronze;

import java.util.Scanner;

public class 카드게임 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i = 0; i < 5; i ++){
            int n = sc.nextInt();
            sum+= n;
        }

        System.out.println(sum);
    }
}
