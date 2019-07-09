package Classwork.Task15;

public class JellyBean extends Sweet {
    private String[] masjelly = {"M&M","Jelly Belly","Jellies"};

    public JellyBean() {
        //стоимость варируется от 200 до 500 рублей
        //Вес варируется от 50 до 150 грамм
        this.price = Math.random()*(301)+200;
        this.uniqweight = (int) (Math.random()*(101)+50);
        this.name = masjelly[(int) (Math.random()*(2))];
    }

}
