package backjoon.재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치_수_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(factorial(n));

    }
    public static int factorial(int n){
        if (n<=1) {
            return n;
        }
        return factorial(n-1)+factorial(n-2);
    }
}
