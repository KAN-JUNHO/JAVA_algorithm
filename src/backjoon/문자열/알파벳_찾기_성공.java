package backjoon.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 알파벳_찾기_성공 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] alpha = new int[26] ;
        String s=br.readLine();

        for(int i=0; i<alpha.length;i++){
            alpha[i]=-1;
        }

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if (alpha[ch-'a']==-1){
                alpha[ch-'a']=i;
            }
        }

        for(int i : alpha) {
            System.out.print(i + " ");
        }
    }
}
