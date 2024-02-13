package baekjoon.silver;

import java.util.Arrays;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){

            arr[i] = sc.nextInt();

        }
        Arrays.sort(arr);
        int ans = 0 ;
        int ans2 = 0 ;
        for(int i = 0 ; i<arr.length;i ++){
            ans += arr[i];
            ans2 += ans;
        }

        System.out.println(ans2);
    }
}
