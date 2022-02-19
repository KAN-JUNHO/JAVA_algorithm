package programgers;

import java.util.*;

public class number2 {
    public static int[] solution(int[] deposit) {

        Stack<Integer> stack = new Stack<>();
        int money= 0;
        for(int i=0; i<deposit.length; i++){
            if(deposit[i]>0){
                stack.push(deposit[i]);
            }else{
                money=Math.abs(deposit[i]);

                while (!stack.isEmpty() && money>=stack.peek()){
                    money-=stack.pop();
                }
                if (!stack.isEmpty() && money>0) {
                    stack.push(stack.pop() - money);
                }

            }
        }
        int[] answer= new int[stack.size()];

        int i=stack.size()-1;
        while(i>-1){
            answer[i]=(stack.pop());
            i--;
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
//        int[] a ={500, -1000, -1500, 500};
//        solution(a);

    }
}