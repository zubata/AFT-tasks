package Classwork.Task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7 {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        double number = Double.parseDouble(rd.readLine());
        rd.close();
        number = number%5;
        if(number>=0&&number<3) System.out.println("Горит зелёный!");
        else if (number>=3&&number<4) System.out.println("Горит жёлтый!");
        else System.out.println("Горит красный!");
    }
}
