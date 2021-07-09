package backjoon.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 수_정렬하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] box = new int[n];
        for(int i=0; i<n; i++){
            box[i]=Integer.parseInt(br.readLine());
        }

        Arrays.sort(box);
        for(int i=0; i<n; i++){
            sb.append(box[i]).append("\n");
        }
        System.out.print(sb);

    }

}
