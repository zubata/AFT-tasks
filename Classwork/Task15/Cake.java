package Classwork.Task15;

public class Cake extends Sweet {
    private String[] mascake = {"Apple Cake","Cherry Cake","Pinapple Cake","Strawberry Cake","Carrot Cake"};

    public Cake() {
        //стоимость варируется от 600 до 1500 рублей
        //Вес варируется от 500 до 1000 грамм
        this.price = Math.random()*(901)+600;
        this.uniqweight = (int) (Math.random()*(501)+500);
        this.name = mascake[(int) (Math.random()*(4))];
    }

}
