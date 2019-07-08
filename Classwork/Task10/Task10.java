package Classwork.Task10;

import java.io.*;

public class Task10 {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("\\\\megafon.ru\\fr\\MF\\MSK\\VOL12\\oleg.zubkov\\Desktop\\res.txt");
        BufferedReader rd1 = new BufferedReader(new InputStreamReader(in));
        String s;
        int count=0;
        while ((s=rd1.readLine())!=null) {
            System.out.println(s);
            count++;
        }
        rd1.close();
        in.close();
        FileOutputStream out = new FileOutputStream("\\\\megafon.ru\\fr\\MF\\MSK\\VOL12\\oleg.zubkov\\Desktop\\res.txt");
        BufferedReader rd2 = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < count; i++) {
            System.out.println("Надо ввести "+count+" Осталось ввести "+i);
            out.write((rd2.readLine()+"\n").getBytes());
            out.flush();
        }
        rd2.close();
        out.close();
    }
}
