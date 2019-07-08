package Homework.Task9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Task9 {
    public static SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");

    public static void main (String[] args) throws IOException, ParseException {
        Train[] mastrain = new Train[5];
        mastrain[0]=new Train("Вологда",5431,dateFormat.parse("13:30"));
        mastrain[1]=new Train("Псков",4321,dateFormat.parse("19:10"));
        mastrain[2]=new Train("Сочи",2341,dateFormat.parse("15:30"));
        mastrain[3]=new Train("Ялта",7431,dateFormat.parse("12:00"));
        mastrain[4]=new Train("Ялта",4311,dateFormat.parse("11:45"));
        int max=0;
        int index=0;
        for (int i = 0; i < mastrain.length; i++) {
            max=mastrain[0].getNumber();
            index=0;
            for (int j = 0; j < mastrain.length-i; j++) {
                if(mastrain[j].getNumber()>=max) {
                    max=mastrain[j].getNumber();
                    index=j;
                }
            }
            Train temp = mastrain[mastrain.length-i-1];
            mastrain[mastrain.length-i-1] = mastrain[index];
            mastrain[index]=temp;
        }
        System.out.println("Упорадочные по номера поезда ");
        for (int i = 0; i < mastrain.length; i++) {
            System.out.printf("%s %d\n",mastrain[i].getDest(),mastrain[i].getNumber());
        }
        System.out.println("Ввести номер поезда: ");
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int number= Integer.parseInt(rd.readLine());
        for (int i = 0; i < mastrain.length; i++) {
            if(mastrain[i].getNumber()==number) {
                System.out.printf("%s %d %s\n",mastrain[i].getDest(),mastrain[i].getNumber(),dateFormat.format(mastrain[i].getTime()));
            }
        }
        System.out.println("Сортировка по имени и дате, если имена равны:");
        for (int i = 0; i < mastrain.length; i++) {
            for (int j = 0; j < mastrain.length-i-1; j++) {
                if(mastrain[j].compareTo(mastrain[j+1])>0) {
                    Train temp = mastrain[j];
                    mastrain[j] = mastrain[j+1];
                    mastrain[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < mastrain.length; i++) {
            System.out.printf("%s %d %s\n",mastrain[i].getDest(),mastrain[i].getNumber(),dateFormat.format(mastrain[i].getTime()));
        }
    }

}
