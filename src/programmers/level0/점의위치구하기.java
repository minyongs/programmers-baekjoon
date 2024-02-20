package programmers.level0;

class 점의위치구하기 {
    public int solution(int[] dot) {
        int ans = 0;
        if(dot[0]>0 && dot[1]>0){
            ans = 1;
        }else if(dot[0]<0 && dot[1]>0){
            ans = 2;

        }else if(dot[0]<0 && dot[1]<0){
            ans =3 ;
        }else
            ans = 4;

        return ans;
    }


}