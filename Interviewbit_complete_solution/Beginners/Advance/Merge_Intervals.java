package Beginners_Batch.Advance;

import java.util.ArrayList;
/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */




public class Merge_Intervals{
    class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }
    }
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {

        ArrayList<Interval> result = new ArrayList<>();
        for (int i = 0; i < intervals.size(); i++) {
            Interval interval = intervals.get(i);
            if (interval.end < newInterval.start) {
                result.add(interval);
            } else if (newInterval.end < interval.start) {
                result.add(newInterval);
                /*here interval.sublist(i, interval.size())
                it means for example: if we want to add the sublist range
                from 3 to 6 then we will write list.sublist(3,6)
                 10,20,30,40,50,60,70
                 m = 3, n = 6
                 ans = 40+50+60+70

                 same thing here also i = index value
                 and interval.size means total length;
                 */
                result.addAll(intervals.subList(i, intervals.size()));
                return result;
            } else {
                int start = Math.min(newInterval.start, interval.start);
                int end = Math.max(newInterval.end, interval.end);
                newInterval.start = start;
                newInterval.end = end;
            }
        }

        result.add(newInterval);

        return result;




    }
}
