package Classwork.Task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//Task6
//Ввести с клавиатуры три числа
//Отсортировать по возрастанию
//Отсортировать по убыванию
//Ввод: 16 43 23 вывод: 16 23 43 : 43 23 16

public class Task6 {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String[] s = rd.readLine().split(" ");
        int[] mas = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            mas[i]=Integer.parseInt(s[i]);
        }
        int max;
        int stepen=0;
        for (int i = 0; i < mas.length; i++) {
            max=mas[0];
            stepen=0;
            for (int j = 1; j < mas.length-i; j++) {
                if(mas[j]>max) {
                    max=mas[j];
                    stepen=j;
                }
            }
            int temp = mas[mas.length-1-i];
            mas[mas.length-1-i]=mas[stepen];
            mas[stepen]=temp;
        }
        String mintomax = Arrays.toString(mas);
        int min;
        for (int i = 0; i < mas.length; i++) {
            min=mas[0];
            stepen=0;
            for (int j = 1; j < mas.length-i; j++) {
                if(mas[j]<min) {
                    min=mas[j];
                    stepen=j;
                }
            }
            int temp = mas[mas.length-1-i];
            mas[mas.length-1-i]=mas[stepen];
            mas[stepen]=temp;
        }
        String maxtomin = Arrays.toString(mas);
        System.out.println(mintomax+" : "+ maxtomin);
    }
}
