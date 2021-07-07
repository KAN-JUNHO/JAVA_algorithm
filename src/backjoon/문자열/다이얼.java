package backjoon.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 다이얼 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toCharArray();
        int time=0;
        for(char ch:chars){
            if(ch>='A' && ch<='C'){
                time+=3;
            } else if (ch >= 'D' && ch <= 'F'){
                time +=4;
            } else if (ch >= 'G' && ch <= 'I'){
                time +=5;
            }else if (ch >= 'J' && ch <= 'L'){
                time +=6;
            }else if (ch >= 'M' && ch <= 'O'){
                time +=7;
            }else if (ch >= 'P' && ch <= 'S'){
                time +=8;
            }else if (ch >='T' && ch <= 'V'){
                time +=9;
            }else if (ch >= 'W' && ch <= 'Z') {
                time += 10;
            }
        }
        System.out.println(time);
    }
}
