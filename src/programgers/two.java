package programgers;

import java.util.Arrays;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class two {
    public static String[] solution(String[] records) {
        String[] answer = {};

        Stack<String> name = new Stack<>();
        Stack<String> command = new Stack<>();
        Stack<String> stack = new Stack<>();

        for(int i=0; i< records.length; i++) {
            String[] rec = records[i].split(" ");


            if (rec[0].equals("check")){
                if (command.peek().equals("comment")){
                    String[] count = name.peek().split(" ");
                    if (count.length==1){
                        stack.push(count[0]+ " " + command.pop() + "ed on your post");
                    } else if(count.length==2){
                        stack.push(count[1]+ " and "+ count[0] +" "+ command.pop() + "ed on your post");
                    }else {
                        int n=count.length-1;
                        stack.push(count[n]+ " and others"+  + n + command.pop() + "ed on your post");
                    }

                    name.pop();
                }else{
                    String[] count = name.peek().split(" ");
                    if (count.length==1){
                        stack.push(count[0]+ " " + command.pop() + "d your post");
                    } else if(count.length==2){
                        stack.push(count[1]+ " and "+ count[0] +" "+ command.pop() + "d your post");
                    }else {
                        int n=count.length-1;

                        stack.push(count[n]+ " and others"+ n +" " + command.pop() + "d your post");
                    }

                    name.pop();

                }
            }else{
                if(!command.isEmpty() && command.peek().equals(rec[1])) {
                    String before =name.pop();
                    name.push(rec[0]+" " + before);

                }else {
                    name.push(rec[0]);
                    command.push(rec[1]);

                }
            }
        }


        System.out.println(stack);
        return stack.toArray(new String[0]);
    }

    public static void main(String[] args) {
        solution(new String[]
                {"john share", "mary comment", "jay share", "check notification", "check notification",
                        "sally comment", "james share", "check notification", "lee share", "laura share",
                        "will share", "check notification", "alice comment", "check notification"});
    }
}

