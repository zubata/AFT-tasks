package Classwork0907.ArrayListVariant;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

//Task:
//Необходимо:
//Прочитать слова из файла.
//Отсортировать в алфавитном порядке.
//Посчитать сколько раз каждое слово встречается в файле.
//Вывести статистику на консоль
//Найти слово с максимальным количеством повторений.
//Вывести на консоль это слово и сколько раз оно встречается в
//файле
//Реализация через ArrayList

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(new FileInputStream("\\\\megafon.ru\\fr\\MF\\MSK\\VOL12\\oleg.zubkov\\Desktop\\res.txt")));
        String[] s =rd.readLine().split(" +");
        rd.close();
        ArrayList<Word> ls = new ArrayList<>();
        int count=0;
        Word temp;
        for (int i = 0; i < s.length; i++) {
            count=0;
            temp = new Word(s[i],0);
            if(ls.contains(temp)) ls.get(ls.indexOf(temp)).setFreq(ls.get(ls.indexOf(temp)).getFreq()+1);
            else ls.add(new Word(s[i],++count));
        }
        Collections.sort(ls);
        int max=0;
        for (Word word : ls) {
            if (word.getFreq() > max) max = word.getFreq();
            System.out.printf("Слово: %s  Частота повторений: %d\n", word.getWord(), word.getFreq());
        }
        System.out.println("Слово (слова) с максимальной частой повторений: "+max);
        for (Word word : ls) {
            if (word.getFreq()==max) System.out.printf("Слово: %s \n",word.getWord());
        }
        //Iterator<Word> it = ls.iterator();
        //while (it.hasNext()) {
        //    Word temp = it.next();
        //    if(temp.getFreq()>1) {
        //        count=0;
        //        for (int j = 0; j < ls.size(); j++) {
        //            if(temp.getWord().equals(ls.get(j).getWord())) count++;
        //        }
        //        if(count>1) it.remove();
        //    }
        //}
    }
}
