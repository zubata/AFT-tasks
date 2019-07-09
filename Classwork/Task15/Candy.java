package Classwork.Task15;

public class Candy extends Sweet{
    private String[] mascandy = {"Kitkat","Mars","Twix","Rotfront","Milkyway"};

    public Candy() {
        //стоимость варируется от 100 до 1000 рублей
        //Вес варируется от 100 до 200 грамм
        this.price = Math.random()*(901)+100;
        this.uniqweight = (int) (Math.random()*(101)+100);
        this.name = mascandy[(int) (Math.random()*(5))];
    }

}
