package Classwork.Task15;

public class Honey extends Sweet {
    private String[] mashoney = {"USA Honey","Bee Honey","Russian Honey"};

    public Honey() {
        //стоимость варируется от 500 до 1500 рублей
        //Вес варируется от 200 до 500 грамм
        this.price = Math.random()*(1001)+500;
        this.uniqweight = (int) (Math.random()*(301)+200);
        this.name = mashoney[(int) (Math.random()*(2))];
    }

}
