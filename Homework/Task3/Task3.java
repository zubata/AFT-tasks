package Homework.Task3;

import java.util.Arrays;

public class Task3 {
    public static void main (String[] args) {
        String s = "Класс String представляет собой неизменяемые  последовательности     символов постоянной длины и частое использование объектов класса занимают много места в   памяти";
        //можно задать через ввод в консоль
        String[] mas = s.split(" +");
        int[] sizemas = new int[mas.length];
        for (int i = 0; i < mas.length; i++) {
            sizemas[i]=mas[i].length();
        }
        int max;
        int index;
        for (int i = 0; i < mas.length; i++) {
            max=mas[0].length();
            index=0;
            for (int j = 0; j < mas.length-i; j++) {
                if(mas[j].length()>=max) {
                    max=mas[j].length();
                    index=j;
                }
            }
            String temp = mas[sizemas.length-i-1];
            mas[sizemas.length-i-1] = mas[index];
            mas[index]=temp;
        }
        for (int i = mas.length-1; i >=0; i--) {
            System.out.print(mas[i] + " ");
        }
    }
}
