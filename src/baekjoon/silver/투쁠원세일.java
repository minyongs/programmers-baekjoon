package baekjoon.silver;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 투쁠원세일 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Integer[] arr = new Integer[n];

        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();

        }
        Arrays.sort(arr, Collections.reverseOrder());
        int a = n / 3 ;
        int sum = 0 ;
        for(int j = 0; j <a; j++){
            sum += arr[3 * j + 3 - 1];
        }

        int ans = 0 ;
        for(int i = 0 ; i < n; i ++){
            ans += arr[i];
        }

        System.out.println(ans -sum);

    }
}
