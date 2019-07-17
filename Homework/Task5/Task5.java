package Homework.Task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// Task5
//Пользователем задается массив чисел и его размерность, если есть место для разбиения массива так, чтобы сумма чисел на одной стороне была равна сумме чисел на другой стороне вывести на экран 2 массива
//(каждый из них одна половина изначального массива) и суммы чисел итоговых массивов.

public class Task5 {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ввести размерность: ");
        int limit = Integer.parseInt(rd.readLine());
        int[] mas = new int[limit];
        System.out.println("Ввести массив: ");
        String[] s=rd.readLine().split(",");
        for (int i = 0; i < s.length; i++) {
            mas[i]=Integer.parseInt(s[i]);
        }
        int temp = limit%2==0?limit/2:(limit/2)+1;
        int[] polovina1 = new int[temp];
        int[] polovina2 = new int[limit-temp];
        int limforpol2=limit%2==0? polovina2.length:polovina2.length+1;
        int sum1=0,sum2=0;
        for (int i = 0; i < limit; i++) {
            if(i<temp) {
                polovina1[i]=mas[i];
                sum1+=polovina1[i];
            }
            else {
                polovina2[i-limforpol2]=mas[i];
                sum2+=polovina2[i-limforpol2];
            }
        }
        if(sum1==sum2) {
            System.out.println("Суммы двух половин совпадают");
            System.out.println("Первая часть массива " + Arrays.toString(polovina1)+"\nСумма этой части "+ sum1);
            System.out.println("Вторая часть массива " + Arrays.toString(polovina2)+"\nСумма этой части "+ sum2);
        }
        else System.out.println("Суммы двух половин не совпадают");
    }
}
