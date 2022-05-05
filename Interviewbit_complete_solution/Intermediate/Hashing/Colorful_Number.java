package Hashing;

import java.util.*;

public class Colorful_Number {
    public int colorful(int A) {
        //O(n^3 solution)
        HashSet<Integer> hashSet = new HashSet<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        while (A != 0) {
            int num = A % 10;
            numbers.add(num);
            A /= 10;
        }
        Collections.reverse(numbers);
        int n = numbers.size();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod = prod * numbers.get(k);
                }
                if (hashSet.contains(prod))
                    return 0;
                hashSet.add(prod);
            }
        }


    return 1;
    }


    public int color_ful_val(int A){
        String s = String.valueOf(A);

        Set<Integer> set = new HashSet<>();

        int temp = 0;

        while (temp < s.length()) {
            //If consecutive Integer is same return 0
            if (set.contains(s.charAt(temp) - '0')) return 0;
            set.add(s.charAt(temp) - '0');
            temp++;
        }

        int i = 0;
        int j = 1;
        int n = s.length();

        int val1 = 0;
        int val2 = 0;

        while (j < n) {

            val1 = s.charAt(i) - '0';
            val2 = s.charAt(j) - '0';

            if (set.contains(val1*val2))
                return 0;

            set.add(val1 * val2);

            i++;
            j++;
        }
        return 1;

    }

}
