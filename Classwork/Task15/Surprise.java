package Classwork.Task15;

import java.util.ArrayList;

public class Surprise {
    private String forwho;
    private ArrayList<Sweet> ls=new ArrayList<>();

    public Surprise() {
        ls.add(new Candy());
        ls.add(new JellyBean());
        ls.add(new Honey());
        ls.add(new Cake());
        ls.add(new Jam());
        ls.add(new Fruits());
    }

    public void setName(String forwho) {
        this.forwho=forwho;
    }

    public String getForwho() {
        return forwho;
    }

    public void setForwho(String forwho) {
        this.forwho = forwho;
    }

    public ArrayList<Sweet> getLs() {
        return ls;
    }

    public void setLs(ArrayList<Sweet> ls) {
        this.ls = ls;
    }

    @Override
    public String toString() {
        StringBuilder temp = new StringBuilder();
        temp.append("Подарок для " + forwho+ "\nСодержимое подарка:\n");
        for (int i = 0; i < ls.size(); i++) {
            temp.append(ls.get(i).toString()).append("\n");
        }
        return String.valueOf(temp);
    }
}
