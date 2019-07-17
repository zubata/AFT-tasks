package Classwork.Task14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Task14 Поиск максимального элемента в массиве.
//Размерность массива задается пользователем.
//Пользователем вводится массив строк.
//В полученном массиве необходимо найти самое длинное и самое короткое слово, вывести оба в консоль.

public class Task14 {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String[] mas=new String[Integer.parseInt(rd.readLine())];
        for (int i = 0; i < mas.length; i++) {
            mas[i]=rd.readLine();
        }
        int min=mas[0].length();
        int minindex=0;
        int max=mas[0].length();
        int maxindex=0;
        for (int i = 0; i < mas.length; i++) {
            if(mas[i].length()>max) {
                max=mas[i].length();
                maxindex=i;
            }
            if(min>mas[i].length()) {
                min=mas[i].length();
                minindex=i;
            }
        }
        System.out.printf("Minimum: %s\n",mas[minindex]);
        System.out.printf("Maximum: %s\n",mas[maxindex]);
    }
}
