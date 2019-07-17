package Classwork.Task11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Task11
//Ввести с консоли число в бинарном формате.
//Перевести его в десятичный формат, записать в переменную int и вывести на экран.
//Необходимо использовать циклы, нельзя использования готовые методы языка Java, для перевода числа из одной системы счисления в другую.

public class Task11 {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String s = rd.readLine();
        rd.close();
        bintodec(s);
    }

    public static void bintodec(String s) {
        int sum=0;
        int a=0;
        int stepen=0;
        for (int i = s.length()-1; i >= 0; i--) {
            if(s.charAt(i)=='1') {
                a=uptostepen(stepen);
                sum=sum+a;
            }
            stepen++;
        }
        System.out.println(sum);
    }

    public static int uptostepen(int stepen) {
        int a=2;
        if(stepen==0) a=1;
        for (int i = 2; i <= stepen; i++) {
            a= a*2;
        }
        //System.out.println(a);
        return a;
    }
}
