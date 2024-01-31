package baekjoon.silver;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//
public class 구간합구하기4 {
    public static void main(String[] args) throws IOException {

        //처음에 주어진 배열이 변하지 않고 , 엄청나게 많은 횟수가 있을땐 항상 구간합 고려해보자 !
        //배열이 변하지 않으니 합 배열을 만들자
        //받는 데이터가 많을땐 bufferReader 사용 추천

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());

        //들어오자마자 바로바로 합배열 만들기
        long [] S= new long[n+1]; //인덱스를 1부터 쓸것임

        stringTokenizer = new StringTokenizer(br.readLine());

        for(int i =1; i<=n ; i++){
            S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken()); // 합배열 공식 -> s[i] = s[i-1] + A[i]
        }
        for(int q = 0 ; q<m;q ++){
            stringTokenizer = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(S[j]-S[i-1]);// 배열합을 이용해 합 구하기
        }






        //첫 풀이 -> 시간 초과
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//
//        int[] arr = new int[n];
//        for(int i = 0; i < n; i++){
//            arr[i] = sc.nextInt();
//        }
//        //
//        int[] arr2 = new int[m];
//        for(int i = 0 ; i < m ; i ++){
//           int sum = 0;
//            int a  = sc.nextInt();
//            int b  = sc.nextInt();
//            for(int j = a-1; j<=b-1;j++){
//                sum += arr[j];
//            }
//
//            arr2[i] = sum;
//
//
//        }
//
//        for(int i = 0 ; i < m; i++){
//            System.out.println(arr2[i]);
//        }
//
//    }
    }
}
