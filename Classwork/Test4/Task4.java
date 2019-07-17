package Classwork.Test4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Task4
//Вывести на экран таблицу умножения для введенного с клавиатуры числа.
//Нельзя использовать циклы
//В коде не должно быть цифр
//Привер ввода "5"
//Пример вывода:
//"5 * 1 = 5"
//"5 * 2 = 5"
//и т.д.

public class Task4 {

    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(rd.readLine());
        rd.close();
        int init=number1/number1;
        System.out.printf("%d + %d = %d\n",number1,init,number1*init);
        System.out.printf("%d + %d = %d\n",number1,++init,number1*init);
        System.out.printf("%d + %d = %d\n",number1,++init,number1*init);
        System.out.printf("%d + %d = %d\n",number1,++init,number1*init);
        System.out.printf("%d + %d = %d\n",number1,++init,number1*init);
        System.out.printf("%d + %d = %d\n",number1,++init,number1*init);
        System.out.printf("%d + %d = %d\n",number1,++init,number1*init);
        System.out.printf("%d + %d = %d\n",number1,++init,number1*init);
        System.out.printf("%d + %d = %d\n",number1,++init,number1*init);
        System.out.printf("%d + %d = %d\n",number1,++init,number1*init);

    }
}
