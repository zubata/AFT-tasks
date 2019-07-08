package Classwork.Test5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test5 {
    public static void main(String[] args) throws IOException {
        int[] mas = new int[3];
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        mas[0]= Integer.parseInt(rd.readLine());
        mas[1]= Integer.parseInt(rd.readLine());
        mas[2]= Integer.parseInt(rd.readLine());
        boolean flag=true;
        for (int i = 0; i < mas.length; i++) {
            int temp=i%3;
            if(!(((mas[i]+mas[(i+1)%3]))>mas[(i+2)%3])&&((mas[i]+mas[(i+2)%3]))>mas[(i+1)%3]) {
                flag=false;
                break;
            }
        }
        if (flag) System.out.println("Треугольник существует");
        else System.out.println("Треугольник не существует");
    }
}
