package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 날짜계산 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] arr = new int[3];
        for(int i = 0 ; i < 3 ; i ++){
            int n = Integer.parseInt(st.nextToken());
            arr[i] = n;
        }
        int [] arr2 = {1,1,1};
        int cnt = 1;

        while(true){
            if(arr[0] == arr2[0] && arr[1] ==arr2[1] && arr[2] == arr2[2]){
                break;
            }
            arr2[0] += 1;
            arr2[1] += 1;
            arr2[2] += 1;

            if(arr2[0]>15){
                arr2[0] = 1;
            }
            if(arr2[1]>28){
                arr2[1] =1;
            }
            if(arr2[2]>19){
                arr2[2] =1;
            }
            cnt ++;



        }
        System.out.println(cnt);
    }
}
