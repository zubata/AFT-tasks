package Homework.Task10;

// Task10
//Класс Покупатель: Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Номер банковского счета; Конструктор; Методы: установка значений атрибутов, получение значений атрибутов, вывод информации.
//Создать массив объектов данного класса. Вывести список покупателей в алфавитном порядке и список покупателей, у которых номер кредитной карточки находится в заданном диапазоне.

public class Task10 {
    public static void main(String[] args) {
        Customer[] mascust = new Customer[6];
        mascust[0]=new Customer("Зина","Аронова","Валерьевна","г.Москва",454384838181L,929292841812L);
        mascust[1]=new Customer("Лидия","Петорва","Геннадьевна","г.Вологда",424384831231L,109292241812L);
        mascust[2]=new Customer("Пётр","Вихт","Владимирович","г.Брянск",257774838181L,233292841654L);
        mascust[3]=new Customer("Василиса","Пушкина","Дмитриевна","г.Тверь",511184839081L,123492841812L);
        mascust[4]=new Customer("Влад","Яхонтова","Олегович","г.Ростов",898948567281L,87694321812L);
        mascust[5]=new Customer("Владлен","Гершкович","Дмитриевич","г.Москва",765184839081L,123492841812L);
        for (int i = 0; i < mascust.length; i++) {
            for (int j = 0; j < mascust.length-i-1; j++) {
                if(mascust[j].getSurname().compareTo(mascust[j+1].getSurname())>0) {
                    Customer temp = mascust[j];
                    mascust[j] = mascust[j+1];
                    mascust[j+1]=temp;
                }
            }
        }
        System.out.println("Вывод массива клиентов после сортировки в алфовитом порядке по фамилии:");
        for (int i = 0; i < mascust.length; i++) {
            System.out.println(mascust[i].getfullinfo());
        }
        System.out.println("Вывод массива клиентов, которых карта находится в пределах 500000000000L и 800000000000L:");
        for (int i = 0; i < mascust.length; i++) {
            if((mascust[i].getCard()>500000000000L)&&(mascust[i].getCard()<800000000000L)) System.out.println(mascust[i].getfullinfo());
        }
    }
}
