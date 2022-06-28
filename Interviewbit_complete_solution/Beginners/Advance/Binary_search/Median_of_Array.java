package Beginners_Batch.Advance.Binary_search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Median_of_Array {

    public static void main(String[] args) {
        Integer[] al = { -50, -41, -40, -19, 5, 21, 28};
        List<Integer> a = Arrays.asList(al);
        Integer[] bl = {-50, -21, -10};
        List<Integer> b = Arrays.asList(bl);

        ArrayList<Integer> res = new ArrayList<>();

        int i = 0;
        int j = 0;

        while(i<a.size() && j<b.size()){
            if(a.get(i)<b.get(j)){
                res.add(a.get(i));
                i++;
            }else{
                res.add(b.get(j));
                j++;
            }
        }
        while(i<a.size()){
            res.add(a.get(i));
            i++;
        }
        while(j<b.size()){
            res.add(b.get(j));
            j++;
        }

        for(int k=0;k<res.size();k++){
           System.out.print(res.get(k)+" ");
        }
        System.out.println();



        int n = res.size();

        double l = res.get((n/2)-1);
        System.out.println(l);
        double m = res.get((n/2));
        System.out.println(m);



        if(n%2!=0){
            double d = res.get(n/2);
            //System.out.println(d);
        }else if(n%2==0){
            double d1 = (res.get(n/2 + 1) + res.get(n/2))/2.0;
           // System.out.println(d1);
        }

    }
}
