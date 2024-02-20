package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class 제로 {
    public static void main(String[] args)throws IOException {
        Stack<Integer> st = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < k ; i++){
            int n = Integer.parseInt(br.readLine());

            if(n == 0){
                st.pop();
            }else
                st.push(n);
        }
        int sum = 0 ;
        for(int i = 0; i < st.size();i++){
            sum += st.elementAt(i);
        }
        System.out.println(sum);



    }
}
