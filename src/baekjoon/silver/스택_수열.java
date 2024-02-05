package baekjoon.silver;

import java.util.Scanner;
import java.util.Stack;

public class 스택_수열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();

        int[] arr= new int[n];
        for(int i = 0; i < n ; i ++){
            arr[i] = sc.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        int num = 1;
        boolean result = true;

        for(int i = 0; i<n; i++){
            int su = arr[i];
            if(su>=num){
                while(su>=num){
                    stack.push(num++);
                    sb.append("+\n");
                }

                stack.pop();
                sb.append("-\n");
            }else {
               int a = stack.pop();
               if(a > su){
                   System.out.println("NO");
                   result = false;
                   break;
               }else{
                   sb.append("-\n");
               }
            }

        }
        if(result){
            System.out.println(sb.toString());
        }

    }



}
