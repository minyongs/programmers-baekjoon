package baekjoon.bronze;
import java.util.Scanner;
import java.util.Arrays;
public class BaekJoon_2751 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < arr.length ; i ++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        for(int j = 0;j < arr.length; j++){
            System.out.println(arr[j]);
        }



    }
}
