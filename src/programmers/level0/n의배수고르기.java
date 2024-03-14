package programmers.level0;

public class n의배수고르기 {
    public int[] solution(int n, int[] numlist) {
        int cnt = 0 ;

        for(int i = 0; i <numlist.length; i++){
            if(numlist[i] % n == 0){
                cnt++;
            }
        }
        int[] arr = new int[cnt];
        int index = 0 ;

        for(int i = 0 ; i < numlist.length;i++){
            if (numlist[i] % n == 0) {
                arr[index] = numlist[i];
                index++;
            }
        }

        return arr;
    }
}
