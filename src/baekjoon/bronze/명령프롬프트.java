package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 명령프롬프트 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] strings = new String[n];

        for(int i = 0 ; i < n ; i ++){
            strings[i] = br.readLine();//string n개가 배열에 저장되어있음
        }

        //인덱스 하나씩 비교함
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < strings[0].length(); i++){
            char ch = strings[0].charAt(i);
            boolean check = true;
           for(int j = 1 ; j < n; j ++){
            if(strings[j].charAt(i) != ch){
                check = false;
                break;
            }
           }
           if(check){
               sb.append(ch);
           }else {
               sb.append('?');
           }
        }
        System.out.println(sb.toString());


    }
}
