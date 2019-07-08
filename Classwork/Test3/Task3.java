package Classwork.Test3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(rd.readLine());
        rd.close();
        if (number>0) System.out.println(number*2);
        else if (number<0) System.out.println(++number);
        else System.out.println(0);
    }
}
