package Beginners_Batch.Advance.Sorting;

import java.util.*;

/*
compareTo() is from the Comparable interface.

compare() is from the Comparator interface.
 */

public class Longest_Number {
    public static void main(String[] args) {
        String[] A= new String[]{"3", "30", "34", "5", "9"};
        List<String> al = Arrays.asList(A);
        getLargestNumber(al);
    }

    private static void getLargestNumber(List<String> al) {
//here we will override the comparator so that it will receive the String
        Collections.sort(al, new Comparator<String>()
        {
            // A comparison function which is used by
            // sort() in printLargest()
            @Override public int compare(String X, String Y)
            {

                // first append Y at the end of X
                String XY = X + Y;

                // then append X at the end of Y
                String YX = Y + X;

                // Now see which of the two
                // formed numbers
                // is greater
                return XY.compareTo(YX) > 0 ? -1 : 1;
            }
        });

        Iterator it = al.iterator();

        while (it.hasNext())
            System.out.print(it.next());
    }

}


