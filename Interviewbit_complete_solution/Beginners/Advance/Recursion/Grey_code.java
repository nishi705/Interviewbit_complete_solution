package Beginners_Batch.Advance.Recursion;

import java.util.ArrayList;

public class Grey_code {
    public static void main(String[] args) {

        int a = 3;
        grayCode(a);

    }

    private static ArrayList<Integer> grayCode(int a) {
        if (a == 0) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(0);
            return list;
        }
        ArrayList<Integer> list = grayCode(a - 1);
       // System.out.println(list);
        /*
        [0]
        [0, 1]
        [0, 1, 3, 2]
         */
        int numtoadd = 1 << (a - 1);
        for (int i = list.size() - 1; i >= 0; i--) {
            list.add(numtoadd + list.get(i));
        }
        return list;
    }
}