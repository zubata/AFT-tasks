package Classwork.Test4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
