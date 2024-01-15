package Algorithms;
import java.util.Scanner;
public class ToOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int cnt = 0;


        while (true) {
        int target =(n/k) * k;
        cnt +=( n-target);
        n= target;

        if(n<k) break;

        cnt += 1;
        n /= k ;
        }
        cnt +=(n-1);
        System.out.println(cnt);
    }}
