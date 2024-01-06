package baekjoon.bronze;

import java.io.IOException;
import java.util.Scanner;
import java.lang.StringBuilder;
public class BaekJoon_2908 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        // 입력이 존재하는지 확인
        if (sc.hasNext()) {
            sb.append(sc.next());
        }

        // 입력이 존재하는지 확인
        if (sc.hasNext()) {
            // 입력이 존재하는지 확인
            if (sc.hasNext()) {
                sb2.append(sc.next());
            }

            sb.reverse();
            sb2.reverse();

            int a = Integer.parseInt(sb.toString()); //정수로 변환후 저장
            int b = Integer.parseInt(sb2.toString());
            int ans = (a > b) ? a : b;
            System.out.println(ans);
        }

    }
}