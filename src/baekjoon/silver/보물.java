package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class 보물 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[n];
        Integer [] arr2 = new Integer[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n ; i ++){
                arr[i] = Integer.parseInt(st.nextToken());
        }

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n; i++){
            arr2[i] = Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(arr);
        Arrays.sort(arr2, Collections.reverseOrder()); // 어짜피 배열 A 의 최솟값을 B 에 최댓값에 맞게 배열할것이기 때문에 B를 건드려도 상관 없음
        int ans = 0;
        for(int i = 0 ; i < n; i++){
            ans += arr[i] *arr2[i];

        }
        System.out.println(ans);

    }
}
