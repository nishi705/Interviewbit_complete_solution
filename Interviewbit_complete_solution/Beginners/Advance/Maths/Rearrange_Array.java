package Beginners_Batch.Advance.Maths;

import java.util.ArrayList;

public class Rearrange_Array {
    static void callval(ArrayList<Integer> list){
        int n = list.size();


        for(int i=0;i<list.size();i++){
           list.set(i,list.get(i) * list.size());
        }

        for(int i=0;i<list.size();i++){
            int index = list.get(i)/n;
            int val = list.get(index)/n;

            int temp = list.get(i) + val;
            list.set(i,temp);
        }



        for(int i=0;i<list.size();i++){
            list.set(i,list.get(i)%n);
        }


        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }


    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(0);
        list.add(2);
        list.add(1);
        list.add(3);

        callval(list);


    }
}
