package Classwork0907.MapVariant;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//Task:
//Необходимо:
//Прочитать слова из файла.
//Отсортировать в алфавитном порядке.
//Посчитать сколько раз каждое слово встречается в файле.
//Вывести статистику на консоль
//Найти слово с максимальным количеством повторений.
//Вывести на консоль это слово и сколько раз оно встречается в
//файле
//Реализация через Map

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(new FileInputStream("\\\\megafon.ru\\fr\\MF\\MSK\\VOL12\\oleg.zubkov\\Desktop\\res.txt")));
        String[] s = rd.readLine().split(" +");
        rd.close();
        TreeMap<String,Integer> tm = new TreeMap<>();
        int count;
        for (int i = 0; i < s.length; i++) {
            count = 0;
            for (int j = 0; j < s.length; j++) {
                if(s[i].equals(s[j])) count++;
            }
            tm.put(s[i],count);
        }
        int max = 0;
        for (Map.Entry<String,Integer> s1 :tm.entrySet()) {
            System.out.printf("Слово: %s  Частота повторений: %d\n",s1.getKey(),s1.getValue());
            if(s1.getValue() > max)
                max=s1.getValue();
        }
        System.out.println("Слово (слова) с максимальной частой повторений: "+max);
        for (Map.Entry<String,Integer> s1 :tm.entrySet()) {
            if (s1.getValue()==max) System.out.printf("Слово: %s \n",s1.getKey());
        }
    }
}
