package Classwork.Task15;

public class Sweet {
    String name;
    double price;
    int uniqweight;

    @Override
    public String toString() {
        return String.format("Тип сладости %s Название: %s Цена: %.2f рублей Вес: %d грамм",this.getClass().getSimpleName(),this.name,this.price,this.uniqweight);
    }
}
