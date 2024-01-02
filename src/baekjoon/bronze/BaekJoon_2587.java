package baekjoon.bronze;
import java.util.Scanner;
import java.util.Arrays;
public class BaekJoon_2587 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0 ;

        int[] arr = new int [5];
        for(int i = 0; i <arr.length ; i++ ){
             arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for(int j = 0 ; j < arr.length; j++){
            sum += arr [j];
        }
        int avg = sum / 5;
        int mid = arr[2];

        System.out.println(avg);
        System.out.println(mid);


    }
}
