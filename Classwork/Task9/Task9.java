package Classwork.Task9;

import java.io.*;

public class Task9 {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("\\\\megafon.ru\\fr\\MF\\MSK\\VOL12\\oleg.zubkov\\Desktop\\res.txt");
        BufferedReader rd = new BufferedReader(new InputStreamReader(in));
        String s;
        while ((s=rd.readLine())!=null) {
            System.out.println(s);
        }
        in.close();
        rd.close();
    }
}
