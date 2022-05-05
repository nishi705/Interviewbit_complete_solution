package Beginners_Batch.Advance;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Interval implements Comparable<Interval>{
    private int start , end;
    public Interval(int start , int end){
        this.start = start;
        this.end = end;
    }
    public int compareTo(Interval o) {
        if(o==null)
            return -1;
        return  start-o.start;
    }
    @Override
    public String toString() {
        return "Interval{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }

    public static void main(String[] args) {
        Interval i1 = new Interval(3,4);
        Interval i2 = new Interval(1,4);
        Interval i3 = new Interval(3,8);
        Interval i4 = new Interval(5,9);

        List<Interval> list = new ArrayList<>();

        list.add(i1);
        list.add(i2);
        list.add(i3);
        list.add(i4);

        System.out.print(list+" ");
        Collections.sort(list);
        System.out.println(list+" ");


    }
}
