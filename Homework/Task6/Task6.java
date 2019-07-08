package Homework.Task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
