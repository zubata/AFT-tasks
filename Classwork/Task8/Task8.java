package Classwork.Task8;

import java.io.*;

//Task8
//Необходимо написать программу, которая будет записывать текстовые данные, введенные с экрана, в файл .txt.
//Запись ввести в файл до тех пор, пока не будет введена команда стоп в консоли.
//Пользователь при тестировании программы по правилу черного ящика должен понимать, какой принцип остановки записи в файл он должен подать.

public class Task8 {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream out = new FileOutputStream("\\\\megafon.ru\\fr\\MF\\MSK\\VOL12\\oleg.zubkov\\Desktop\\res.txt");
        String s;
        while (!((s=rd.readLine()).equals("stop"))) {
            out.write((s+"\n").getBytes());
            out.flush();
        }
        rd.close();
        out.close();
    }
}
