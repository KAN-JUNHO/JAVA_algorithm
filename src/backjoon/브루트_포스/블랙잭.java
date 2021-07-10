package backjoon.브루트_포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 블랙잭 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        int[] cards = new int[n];

        st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<n;i++){
            cards[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(black(cards,n,m));

    }

    private static int black(int[] cards,int n, int m) {
        int max=0;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    int hap = cards[i]+cards[j]+cards[k];
                    if (hap==m){
                        return hap;
                    }else if (m>hap){
                        max=Math.max(hap,max);
                    }
                }
            }
        }
        return max;
    }

}
