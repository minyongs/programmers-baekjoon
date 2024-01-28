package baekjoon.bronze;
import java.util.Scanner;
public class BaekJoon_1075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt();
        int F = sc.nextInt();

        int x =((N/100)*100);
        int ans;
        while (true){
            if(x % F == 0){
                break;
            }
            x++;
        }
        System.out.printf("%02d",x % 100); //정수를 두자리로 표현하고 , 필요한 경우 0 으로 채워라 !
        //정수형태를 특정 위치만 출력할땐 이런 방법도 써보자











    }
}
