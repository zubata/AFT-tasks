package Homework.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1  {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String s1 = rd.readLine().toLowerCase(); //если нужно учесть буквы внезависимости от порядка, то будет использоваться .toLowerCase(), но в условии только про символы сказано
        String s2 = rd.readLine().toLowerCase();
        rd.close();
        String news1= s1.length()>s2.length() ? s1:s2;
        String news2= s1.length()>s2.length() ? s2:s1;
        int count=0;
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < news1.length(); i++) {
            for (int j = 0; j < news1.length(); j++) {
                if(news1.charAt(i)==news1.charAt(j)) {
                    count++;
                }
            }
            if(count==1) {
                for (int j = 0; j < news2.length(); j++) {
                    if(news1.charAt(i)==news2.charAt(j)) {
                        count++;
                    }
                }
                if(count==2) res.append(news1.charAt(i)).append(" ");
            }
            count=0;
        }
        System.out.println("Символы, которые встречаютс только один раз (в самом слове и в другом): "+res);
    }
}
