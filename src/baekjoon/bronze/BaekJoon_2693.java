package baekjoon.bronze;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class BaekJoon_2693 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int a;
        Integer [] arr = new Integer[10];
        int[] arr2 = new int[t];
        for(int i = 0 ; i < t; i++){

            for(int j = 0; j <10; j++){

                arr[j] = sc.nextInt();  // 만든 배열 저장

            }
            Arrays.sort(arr,Collections.reverseOrder());
            arr2[i] = arr[2];


        }
        for(int i = 0 ; i < arr2.length; i++){
            System.out.println(arr2[i]);

        }
    }
}
