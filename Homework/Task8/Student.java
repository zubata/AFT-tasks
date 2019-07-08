package Homework.Task8;

public class Student {
    private String surname;
    private String inicail;
    private int groupnumber;
    private int[] measure;

    public Student(String surname, String inicail, int groupnumber, int[] measure) {
        this.surname = surname;
        this.inicail = inicail;
        this.groupnumber = groupnumber;
        this.measure = measure;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getInicail() {
        return inicail;
    }

    public void setInicail(String inicail) {
        this.inicail = inicail;
    }

    public int getGroupnumber() {
        return groupnumber;
    }

    public void setGroupnumber(int groupnumber) {
        this.groupnumber = groupnumber;
    }

    public int[] getMeasure() {
        return measure;
    }

    public void setMeasure(int[] measure) {
        this.measure = measure;
    }
}
