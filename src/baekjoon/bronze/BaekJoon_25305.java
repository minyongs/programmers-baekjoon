package baekjoon.bronze;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

import static java.util.Collections.reverseOrder;

public class BaekJoon_25305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num= sc.nextInt();
        int k = sc. nextInt();

        Integer[] arr = new Integer[num]; // 내림차순 정렬하기 위한 콜렉션은 기본형 불가 , Wrapper 사용
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr, reverseOrder()); //내림차순


        int a = arr[k-1];
        System.out.println(a);




    }
}
