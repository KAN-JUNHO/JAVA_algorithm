package programgers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class number3 {
    public static int solution(int n, int[][] wires) {
        int answer = -1;
        Map<Integer, ArrayList<Integer[]>> ht = new HashMap<Integer, ArrayList<Integer[]>>();
        for(int i=0; i<wires.length;i++){
            ArrayList<Integer[]> list = new ArrayList<>();
            if (ht.containsKey(wires[i][0])){
                list=ht.get(wires[i][0]);
            }
        }

        System.out.println(ht);
        System.out.println(ht.get(1));
        return answer;
    }

    public static void main(String[] args) {
        int[][] a= new int[][]{{1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}};
        solution(9,a);
    }

}
