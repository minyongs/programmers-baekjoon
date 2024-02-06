package baekjoon.silver;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



public class 카드2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        int n = sc.nextInt();

        for(int i = 0; i <n ; i ++){
            queue.add(i+1);

        }

        while (queue.size() >1){
            queue.poll();
            queue.add(queue.poll());
        }
        System.out.println(queue.poll());






    }
}

//시간 초과
//StringBuilder sb =new StringBuilder();
//Scanner sc = new Scanner(System.in);
//
//
//int n = sc.nextInt();
//int[] arr = new int[n];
//
//        for(int i = 0 ; i <n ; i++){
//        sb.append(i+1);
//        }
//
//
//                for(int i = 0 ; i < n-1; i ++){ //n-1 번 반복
//char c = sb.charAt(1);
//            sb.append(c);
//            sb.deleteCharAt(0);
//            sb.deleteCharAt(1);
//
//
//        }
//
//
//                System.out.println(Integer.parseInt(sb.toString()));