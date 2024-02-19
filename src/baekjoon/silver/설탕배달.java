package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//아이디어 : 큰 수로 나눠지면 큰 수가 정답 ,
// 작은 수부터 빼서 큰 수의 배수를 만들고 , 큰수로 나눠버리자 !
//계속 뺐을때 음수가 되면 -1 출력
public class 설탕배달 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int ans =0 ;



       while(n> 0){
           if(n%5 == 0){
               n=(n-5);
               ans++;

           }else {
               n = (n - 3);
               ans++;
           }

       }
       if (n<0){
           ans = -1 ;
       }
        System.out.println(ans);
    }
}
