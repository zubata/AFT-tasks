package Classwork.Task13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task13 {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String[] s = rd.readLine().split(" ");
        int a = Integer.parseInt(s[1]);
        int b = Integer.parseInt(s[2]);
        int res=0;
        if (s[0].equals("+")) res=plusoper(a,b);
        else if (s[0].equals("-")) res=minusoper(a,b);
        else if (s[0].equals("*")) res=multisoper(a,b);
        else if (s[0].equals("/")) res=divoper(a,b);
        System.out.println(res);
    }

    public static int minusoper(int a, int b) {
        return a-b;
    }
    public static int plusoper(int a, int b) {
        return a+b;
    }
    public static int multisoper(int a, int b) {
        return a*b;
    }
    public static int divoper(int a, int b) {
        return a/b;
    }
}
