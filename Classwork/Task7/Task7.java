package Classwork.Task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Task7 Светофор
//В начале каждого часа в течении 3х минут горит зеленый сигнал
//затем в течении одной минуты горит желтый
//затем в течении одной минуты горит красный
//затем опять зеленый горит 3 минуты и т.д.
//Ввести с клавиатуры число, означающее время в минутах, прошедшее с начала очередного часа.
//Определить сигнал какого цвета горит в данный момент.
//Вывод: Зеленый / Желтый / Красный

public class Task7 {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        double number = Double.parseDouble(rd.readLine());
        rd.close();
        number = number%5;
        if(number>=0&&number<3) System.out.println("Горит зелёный!");
        else if (number>=3&&number<4) System.out.println("Горит жёлтый!");
        else System.out.println("Горит красный!");
    }
}
