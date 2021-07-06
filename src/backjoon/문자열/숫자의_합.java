package backjoon.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 숫자의_합 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String[] b=br.readLine().split("");
        int hap =0;

        for(int i=0; i<b.length; i++){
            hap+=Integer.parseInt(b[i]);
        }
        System.out.println(hap);
    }
}
