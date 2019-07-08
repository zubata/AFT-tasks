package Classwork.Task12;

import java.util.Arrays;

public class Task12 {
    public static void main(String[] args) {
        int[] mas = new int[20];
        int temprandom;
        int maxi=10;
        int mini=-11;
        for (int i = 0; i < mas.length; i++) {
            //Random rnd = new Random(System.currentTimeMillis());
            mas[i] = (int) ((Math.random() * ((maxi - mini) + 1)) + mini);
        }
        System.out.println(Arrays.toString(mas));
        int max=mas[0];
        int maxstep=0;
        for (int i = 0; i < mas.length; i++) {
            if(mas[i]>max) {
                max=mas[i];
                maxstep=i;
            }
        }
        int min=mas[0];
        int minstep=0;
        for (int i = 0; i < mas.length; i++) {
            if(min>mas[i]) {
                min=mas[i];
                minstep=i;
            }
        }
        int temp = mas[maxstep];
        mas[maxstep] = mas[minstep];
        mas[minstep]=temp;
        System.out.println(max+"  "+min);
        System.out.println(Arrays.toString(mas));
    }
}
