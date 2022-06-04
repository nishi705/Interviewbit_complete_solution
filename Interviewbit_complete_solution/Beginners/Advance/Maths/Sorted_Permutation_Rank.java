package Beginners_Batch.Advance.Maths;

import java.util.ArrayList;
import java.util.Arrays;

public class Sorted_Permutation_Rank {
    static long fact(long a){
        long factorial = 1;
        for(int i = 1; i <= a; ++i)
        {
            factorial *= i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        String A = "gTFAMYjxCewRlftmGOKJHUuhSBVDZnbqyoPQadEkLrpNsv";
        //good approach
        int n = A.length();
        long count = 0;
        long ans = 0;
        int mod = 1000003;
        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = i + 1; j < n; j++) {
                if (A.charAt(j) < A.charAt(i)) {
                    count++; }
            }
            ans += (count * fact(n - i - 1)) % mod; }
        System.out.println((int) (ans + 1) % mod);
    }
//         int n = s.length();
//
//        String s1 = s;
//
//        char[] c = s.toCharArray();
//        Arrays.sort(c);
//        ArrayList<Character> al = new ArrayList<>();
//        for(int i=0;i<c.length;i++){
//            al.add(c[i]);
//        }
//        long total = 1;
//        for(int i=0;i<s.length();i++){
//            long len = s.length()-i-1;
//            char c1 = s.charAt(i);
//
//            long count = 0;
//            for(int j=0;j<al.size();j++){
//                if(c1==al.get(j)){
//                    al.remove(al.get(j));
//                    break;
//                }else{
//                    count++;
//                }
//            }
//            total = (total + ((fact(len)*count)%1000003))%1000003;
//        }
//        total = total+1000003;
//        total = total%1000003;
//        System.out.println((int)total);

}
