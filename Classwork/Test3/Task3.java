package Classwork.Test3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Task3
//Написать метод
//Положительное или отрицательное число
//Ввести число с клавиатуры
//Если число положительное, то увеличить его в два раза
//Если число отрицательное, то прибавить к нему единицу
//Есди введенное число равно 0, то вывести на экран 0.

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(rd.readLine());
        rd.close();
        if (number>0) System.out.println(number*2);
        else if (number<0) System.out.println(++number);
        else System.out.println(0);
    }
}
