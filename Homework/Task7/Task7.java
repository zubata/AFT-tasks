package Homework.Task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// Task7
//Вы едете слишком быстро, и полицейский останавливает вас. Напишите код для вычисления результата, закодированный как значение типа int: 0 = нет штрафа, 1 = маленький штраф, 2 = большой штраф.
//Если скорость равна 60 или меньше, результат равен 0. Если скорость находится между 61 и 80 включительно, результат равен 1. Если скорость равна 81 или больше, результат равен 2.
//Если это не ваш день рождения - в этот день ваш Скорость может быть на 5 выше во всех случаях. Текущая дата задается рандомно, дата рождения вводится с клавиатуры.

public class Task7 {
    public static SimpleDateFormat dateFormat = new SimpleDateFormat("dd.mm.yyyy");

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        Human me = new Human();
        System.out.println("Ввести дату рождения (формат дд.мм.гггг): ");
        me.setDate(dateFormat.parse(rd.readLine()));;
        Date currentdate = randomdate(me.getDate());
        System.out.println("Ввести скорость: ");
        me.setSpeed(Integer.parseInt(rd.readLine()));
        System.out.println("Закодированный результат :"+srav(me,currentdate));
    }

    public static int srav(Human me,Date currentdate) {
        int res=0;
        int limit=60;
        if(!(me.getDate().equals(currentdate))) limit=limit+5;
        if(me.getSpeed()>limit&&me.getSpeed()<=(limit+20)) res=1;
        else if(me.getSpeed()>(limit+20)) res=2;
        return res;
    }

    public static Date randomdate(Date datebirth) throws ParseException {
        //отрезок выбирается из дата рождения+18 - нынешний 2019 год
        int yeargetright = datebirth.getYear()+1900+18;
        int year = (int) ((Math.random()*(2019 - yeargetright))+yeargetright);
        boolean viskosnyiflag;
        if (year % 100 == 0) { viskosnyiflag= year % 400 == 0; }
        else { viskosnyiflag= year % 4 == 0; }
        int month = (int) ((Math.random()*13)+1);
        int day;
        if ((month==4)||(month==6)||(month==9)||(month==11)) { day = (int) ((Math.random()*31)+1); }
        else if(month==2) {
            if(viskosnyiflag) {day = (int) ((Math.random()*30)+1);}
            else {day = (int) ((Math.random()*29)+1);}
        }
        else {day = (int) ((Math.random()*32)+1);}
        return dateFormat.parse(String.valueOf((day < 10 ? "0" + day : day) + "." + (month < 10 ? "0" + month : month) + "." + year));
    }
}
