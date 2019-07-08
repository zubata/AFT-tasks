package Homework.Task9;

import java.util.Date;

public class Train implements Comparable<Train> {
    private String dest;
    private int number;
    private Date time;

    @Override
    public int compareTo(Train o) {
        if(this.dest.compareTo(o.getDest())>0) return 1;
        else if(this.dest.compareTo(o.getDest())<0) return -1;
        else {
            if(this.time.compareTo(o.getTime())>0) return 1;
            else return -1;
        }
    }

    public Train(String dest, int number, Date time) {
        this.dest = dest;
        this.number = number;
        this.time = time;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
