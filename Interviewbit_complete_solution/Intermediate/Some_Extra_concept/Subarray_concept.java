package Some_Extra_concept;

import java.util.HashSet;

public class Subarray_concept {
    public static void main(String[] args) {
        int a = 234;
        String s = String.valueOf(a);
        //System.out.println(s);
        String str = Integer.toString(a);
        System.out.println(str);

    }


//    static void productsDistinct(int N)
//    {
//
//        // To store the given number
//        // as a string
//        String s = "";
//
//        // Append all the digits
//        // starting from the end
//        while (N > 0)
//        {
//            s += (char)(N % 10 + '0');
//            N /= 10;
//        }
//
//        // Reverse the string to get
//        // the original number
//        s = reverse(s);
//
//        // Store size of the string
//        int sz = s.length();
//
//        // Set to store product of
//        // each contiguous subsequence
//        HashSet<Integer> se = new HashSet<Integer>();
//
//        // Find product of every
//        // contiguous subsequence
//        for (int i = 0; i < sz; i++)
//        {
//            int product = 1;
//            for (int j = i; j < sz; j++)
//            {
//                System.out.print(s.charAt(j));
//               product *= (int)(s.charAt(j) - '0');
//                System.out.println("product of"+s.charAt(j)+ "=" + product );
//
//               // System.out.println(product);
//
//                // If current product already
//                // exists in the set
////                if (se.contains(product))
////                    return false;
////                else
////                    se.add(product);
//
//            }
//
//        }
//      //  return true;
//    }

//    static String reverse(String input)
//    {
//        char[] a = input.toCharArray();
//        int l, r;
//        r = a.length - 1;
//        for (l = 0; l < r; l++, r--)
//        {
//            // Swap values of l and r
//            char temp = a[l];
//            a[l] = a[r];
//            a[r] = temp;
//        }
//        return String.valueOf(a);
//    }

    // Driver code
//    public static void main(String[] args)
//    {
//        int N = 2345;
//
//       productsDistinct(N);
//            //System.out.println("Yes");
//        else
//            System.out.println("No");
//    }




//    public static void main(String[] args) {
//        String s = "aba";
//
//        for(int i=0;i<s.length();i++){
//            for(int j=0;j<s.length();j++){
//                for(int k=i;k<=j;k++) {
//                    System.out.print(s.charAt(k));
//                }
//                System.out.println();
//            }
//
//
//        }
//    }





//    HashSet<Integer> check = new HashSet<Integer>();
//    String str = Integer.toString(A);
//        for(int i=0;i<str.length();i++){
//        int product = 1;
//        for(int j=i; j<str.length();j++){
//            int num = str.charAt(j) - '0';
//            product *= num;
//            if(check.contains(product)) return 0;
//            check.add(product);
//        }
//    }
//        return 1;
}
