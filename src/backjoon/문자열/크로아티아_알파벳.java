package backjoon.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 크로아티아_알파벳 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] alpha = new String[]{"c=", "c-", "dz=", "d-", "lj", "nj","s=", "z="};
        String str = br.readLine();
        for(String i:alpha){
            str=str.replace(i,"X");
        }
        System.out.println(str.length());
    }
}
