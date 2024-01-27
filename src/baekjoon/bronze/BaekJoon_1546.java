package baekjoon.bronze;
//주의사항 : int , double형 잘 고려해서 쓰자
import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_1546 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //시험본 과목의 갯수
        int n  = sc.nextInt();
        double [] arr = new double[n];

        for(int i =0 ; i < n; i++){
            arr[i] = sc.nextDouble();
        }

        Arrays.sort(arr);//40 60 80
        double max = arr[n-1];
        double[] newArr = new double[n];
        double sum = 0;

        for(int i = 0 ; i < n ; i++){
            newArr[i] = (arr[i]/max)*100;
            sum += newArr[i];

        }
        double avg =sum/n;

        System.out.println(avg);







    }
}
