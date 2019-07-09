package Classwork.Task15;

public class Fruits extends Sweet {
    private String[] masfruits = {"Apple","Blueberries","Strawberry","Peaches","Raspberries"};

    public Fruits() {
        //стоимость варируется от 50 до 500 рублей
        //Вес варируется от 200 до 1000 грамм
        this.price = Math.random()*(451)+50;
        this.uniqweight = (int) (Math.random()*(801)+200);
        this.name = masfruits[(int) (Math.random()*(4))];
    }

}
