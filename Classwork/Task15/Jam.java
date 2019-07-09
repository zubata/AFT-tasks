package Classwork.Task15;

public class Jam extends Sweet {
    private String[] masjam = {"Apple Jam","Pinapple Jam","Strawberry Jam","Apricot Jam","Cherry Jam"};

    public Jam() {
        //стоимость варируется от 150 до 500 рублей
        //Вес варируется от 200 до 450 грамм
        this.price = Math.random()*(351)+150;
        this.uniqweight = (int) (Math.random()*(151)+200);
        this.name = masjam[(int) (Math.random()*(4))];
    }

}
