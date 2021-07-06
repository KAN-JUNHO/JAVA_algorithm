package backjoon.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 단어_공부 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Character, Integer> map = new HashMap<>();

        char[] n = br.readLine().toUpperCase().toCharArray();

        for(int i=0; i<n.length;i++){
            if (!map.containsKey(n[i])){
                map.put(n[i],1);
            } else {
                map.put(n[i], map.get(n[i]) + 1);
            }
        }

        int max=-1;
        boolean check=true;
        char max_key=' ';
        for(char c : map.keySet()) {
            if(max < map.get(c)) {
                max = map.get(c);
                max_key=c;
            }
        }
        Collection<Integer> box =map.values();

        int cnt=0;
        for(int i:box){
            if(i==max){
                cnt++;
            }
        }
        System.out.println(cnt>1 ? "?" :max_key);
    }

}
