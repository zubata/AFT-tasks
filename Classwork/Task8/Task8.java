package Classwork.Task8;

import java.io.*;

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
