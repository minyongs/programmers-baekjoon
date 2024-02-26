package baekjoon.bronze;

import java.util.Scanner;

public class 네번째점 {
    public static void main(String[] args) {
        int[] x = new int[3];
        int[] y = new int[3];
        Scanner sc= new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        int a;
        int b;
        if(x[0]==x[1]){
            a = x[2];
        }else if(x[0] != x[1] && x[1] == x[2]){
            a = x[0];
        }else{
            a = x[1];
        }

        if(y[0]==y[1]){
            b = y[2];
        }else if(y[0] != y[1] && y[1] == y[2]){
            b = y[0];
        }else{
            b = y[1];
        }



        System.out.println(a +" "+ b);
    }
}
