package Homework.Task8;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        Student[] masstudents=new Student[10];
        masstudents[0]=new Student("Фролов","А.Д.",10, new int[]{5, 3, 2, 4});
        masstudents[1]=new Student("Зубов","В.Д.",5, new int[]{2, 3, 3, 3});
        masstudents[2]=new Student("Пупкин","Г.Д.",10, new int[]{5, 5, 3, 4});
        masstudents[3]=new Student("Осипенко","Е.В.",9, new int[]{5, 5, 4, 5});
        masstudents[4]=new Student("Киржач","Д.Г.",3, new int[]{2, 3, 3, 2});
        masstudents[5]=new Student("Френель","А.А.",5, new int[]{3, 3, 3, 4});
        masstudents[6]=new Student("Максименко","Б.Г.",9, new int[]{5, 5, 5, 3});
        masstudents[7]=new Student("Лысов","С.С.",7, new int[]{3, 5, 3, 3});
        masstudents[8]=new Student("Фет","А.Б.",6, new int[]{5, 5, 5, 5});
        masstudents[9]=new Student("Фролов","А.Д.",10, new int[]{3, 3, 3, 3});
        float[] avgmeas= new float[10];
        for (int i = 0; i < masstudents.length; i++) {
            float sum=0;
            for (int j = 0; j < masstudents[i].getMeasure().length; j++) {
                sum = sum + masstudents[i].getMeasure()[j];
            }
            avgmeas[i]=sum/4;
        }
        float max=0;
        int index=0;
        for (int i = 0; i < masstudents.length; i++) {
            max=avgmeas[0];
            index=0;
            for (int j = 0; j < masstudents.length-i; j++) {
                if(avgmeas[j]>=max) {
                    max=avgmeas[j];
                    index=j;
                }
            }
            float temp = avgmeas[avgmeas.length-i-1];
            avgmeas[avgmeas.length-i-1] = avgmeas[index];
            avgmeas[index]=temp;
            Student temps = masstudents[masstudents.length-i-1];
            masstudents[masstudents.length-i-1] = masstudents[index];
            masstudents[index]=temps;
        }
        System.out.println("Упорядочный список по средним оценкам:");
        for (int i = 0; i < masstudents.length; i++) {
            System.out.printf("%s %s %d %s\n",masstudents[i].getSurname(),masstudents[i].getInicail(),masstudents[i].getGroupnumber(), Arrays.toString(masstudents[i].getMeasure()));
        }
        boolean wellmeas=false;
        System.out.println("Студенты, которые имеют только 4 или 5:");
        for (int i = 0; i < masstudents.length; i++) {
            for (int j = 0; j <masstudents[i].getMeasure().length; j++) {
                if(masstudents[i].getMeasure()[j]==4||masstudents[i].getMeasure()[j]==5) wellmeas=true; break;
            }
            if(wellmeas) System.out.printf("%s %d\n",masstudents[i].getSurname(),masstudents[i].getGroupnumber());
        }
    }
}
