package Classwork.Task15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//Task15
//Формируется новогодний подарок.
//Он может содержать различные сладости (Candy, Jellybean, etc (в программе должно быть не менее 7 видов)).
//У каждой сладости есть название, цена, уникальный параметр.
//Необходимо собрать подарок. Найти вес подарка, общую стоимость, вывести информацию в консоль.
//Реализация:
//Должен быть родительский класс Sweet, от которого будут наследоваться остальные классы сладостей.
//Название, цена, уникальный параметр должны быть переменными экземпляра класса.
//Подарок должен быть отдельным классом.
//Стоимость и цены и наполнение подарка должны быть экземплярами класса и вычислятся автоматически.
//Экзепляра класса для хранения сладостей (массив или лист или Generic).
//Для вывода в консоль веса и общей стоимости необходимо переопределить toString. Так же данный класс должен содержать переменную

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
