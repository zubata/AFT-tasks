package Homework.Task2;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            res.append((int) (Math.random()*10));
        }
        char[] alphabet= new String("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ").toCharArray(); //если хотим ещё и русские буквы, то просто добавляем рус. алфавит в эту строку
        for (int i = 0; i < 2; i++) {
            res.append(alphabet[(int) (Math.random()*alphabet.length)]);
        }
        int[] mas=new int[4];
        boolean flag=false;
        while(true) {
            for (int i = 0; i < 4; i++) {
                mas[i]=(int) (Math.random()*2);
                if (mas[i]==1) flag=true;
            }
            if(flag) {
                for (int i = 0; i < 4; i++) {
                    res.append(mas[i]);
                }
                break;
            }
        }
        System.out.println(res);
        //String temp= String.valueOf((Math.random()*1000));
        //res.append(temp);
        //if(temp.contains("1"))  {
        //    res.append(temp);
        //}
        //String temps = Arrays.toString(mas);
        //if(temps.contains("1"))  {
        //    res.append(temps);
        //    break;
        //}
    }
}
