package Homework.Task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Task6
//Когда белки собираются на вечеринку, им нравится курить сигары. Вечеринка успешна, когда количество сигар составляет от 40 до 60 включительно.
//Если это не выходные, в этом случае не существует верхней границы количества сигар.
//Вернуть true, если партия с заданными значениями успешна, или false в противном случае.

public class Task6 {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        Belkaparty party = new Belkaparty();
        String[] masdays={"Понедельник","Вторник","Среда","Четверг","Пятница","Суббота","Воскресенье"};
        boolean flag=false;
        while (true) {
            System.out.println("Какой день недели: ");
            party.setDate(rd.readLine());
            for (String s:masdays) {
                if(party.getDate().equals(s)) flag=true;
            }
            if (flag) break;
        }
        System.out.println("Количество выкуренных сигар: ");
        party.setCigarcount(Integer.parseInt(rd.readLine()));
        boolean happyflag;
        if(party.getDate().equals("Суббота")||party.getDate().equals("Воскресенье")) {
            happyflag= party.getCigarcount() >= 40 && party.getCigarcount() <= 60;
        }
        else happyflag= party.getCigarcount() >= 40;
        if(happyflag) System.out.println("Вечеринка удалась!");
        else System.out.println("Вечеринка не удалась :(");
    }
}
