package Homework.Task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int razmer=0;
        String[] s;
        while(true) {
            System.out.println("Введите размерность массивов ");
            razmer = Integer.parseInt(rd.readLine());
            if (razmer>3) break;
            else System.out.println("Неверное число, нужно не менее 4 символов");
        }
        System.out.println("Ввести данные для первого массива через запятую ");
        int[] mas1=new int[razmer];
        s=rd.readLine().split(",");
        for (int i = 0; i < s.length; i++) {
            set(mas1,Integer.parseInt(s[i]),i);
        }
        System.out.println("Ввести данные для второго массива через запятую ");
        int[] mas2=new int[razmer];
        s=rd.readLine().split(",");
        for (int i = 0; i < s.length; i++) {
            set(mas2,Integer.parseInt(s[i]),i);
        }
        int limit = razmer%2==0? razmer/2:(razmer/2)+1;
        int[] summass=new int[limit];
        int temp;
        for (int i = 0; i < limit; i++) {
            temp=get(mas1,i)+get(mas2,i);
            set(summass,temp,i);
        }
        System.out.println("Массив до перемещений "+Arrays.toString(summass));
        for (int i = 0; i < summass.length; i++) {
            int change=(int) (Math.random()*summass.length);
            temp=get(summass,change);
            set(summass,get(summass,i),change);
            set(summass,temp,i);
        }
        System.out.println("Массив после перемещений "+Arrays.toString(summass));

    }

    public static int[] set(int[]mas,int number,int index) {
        mas[index]=number;
        return mas;
    }

    public static int get(int[]mas, int index) {
        return mas[index];
    }

    //System.out.println(change);
    //temp=summass[change];
    //summass[change]=summass[i];
    //summass[i] = temp;
}
