package baekjoon.silver;


import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;
import java.util.StringTokenizer;

//아이디어 : boolean 2차원 배열을 선언해 하나하나 마킹해가며 갯수 세기
public class 색종이 {
    public static void main(String[] args)  throws IOException{
            boolean[][] arr = new boolean[101][101];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(br.readLine());
            int sum = 0 ;

            for(int i = 0 ; i < n ; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                for(int j=x; j<x+10 ; j++){
                    for(int l = y; l<y+10; l++){
                        if(!arr[j][l]){
                            arr[j][l] = true;
                            sum++;
                        }
                    }
                }

            }
        System.out.println(sum);
    }
}
