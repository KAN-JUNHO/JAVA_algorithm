package backjoon.정렬;
import java.io.*;
import java.util.*;

public class 통계학 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N  = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        List<Integer> list = new ArrayList<>();
        int[] check = new int[8001];
        int max = 0;
        int sum = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
            check[arr[i] + 4000]+=1;
        }

        System.out.println((int)Math.round((double)sum/N));
        Arrays.sort(arr);
        System.out.println(arr[N/2]);

        for (int i = 0; i < 8001; i++) max = Math.max(max, check[i]);
        for (int i = 0; i < 8001; i++) if(check[i] == max) list.add(i - 4000);

        System.out.println(list.size() > 1 ? list.get(1) : list.get(0));
        System.out.println(arr[arr.length-1] - arr[0]);
    }
}
