package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 일로만들기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt =0;
        while(true){

            n -= 1;

            cnt++;


            if(n%3 == 0) {
                n /= 3;
                cnt++;

                continue;

            }
            if (n%2 == 0){
                n/=2;
                cnt++;

                continue;
            }
            if(n==1){

                break;
            }

        }

        System.out.println(cnt);
    }
}
