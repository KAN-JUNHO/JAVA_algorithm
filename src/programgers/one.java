package programgers;

import java.util.*;

public class one {
    public static int solution(int[] arr) {
        Arrays.sort(arr);
        Map<Integer,Integer> map = new HashMap<>();
        int answer=255;
        int before=255;
        for (int i=255; i>=0;i--){
            int over=0;
            int under=0;
            for (int j=0; j< arr.length; j++){
                if (i<=arr[j]){
                    over+=1;
                }else if (i>arr[j]){
                    under-=1;
                }
            }
            int diff=Math.abs(over+under);
            if (diff==0){
                return i;
            }else {
                if(diff<before){
                    answer=i;
                    before=diff;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int a=solution(new int[]{1,52,125,10,25,201,244,192,128,23,203,98,154,255});
        System.out.println(a);
    }
}
