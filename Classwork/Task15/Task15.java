package Classwork.Task15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task15 {
    public static void main(String[] args) throws IOException {
        ArrayList<Surprise> listsur = new ArrayList<>();
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; true ; i++) {
            listsur.add(new Surprise());
            System.out.println("Подарок сгенерирован, для кого собрать подарок?");
            listsur.get(i).setForwho(rd.readLine());
            System.out.println("Подарок для " + listsur.get(i).getForwho() + " готов\nПриготовить ещё для кого-то подарок? (если не надо ввести 'нет')");
            if(rd.readLine().equals("нет")) break;
        }
        for (int i = 0; i < listsur.size(); i++) {
            System.out.println(listsur.get(i).toString());
        }
    }
}
