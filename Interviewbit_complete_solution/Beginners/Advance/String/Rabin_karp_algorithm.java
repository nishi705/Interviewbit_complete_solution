package Beginners_Batch.Advance.String;

public class Rabin_karp_algorithm {
    public static void main(String[] args) {
        // d is the number of characters in the input alphabet
       int d = 256;
        // A prime number
        int q = 101;
        String s ="aababcaab";
        String a = "abc";
        int i,j;
        int p = 0; // hash value for pattern
        int t = 0;

        int m = a.length();
      //  System.out.println(m);
        int n =  s.length();
        int h =1;

        for (i = 0; i < m-1; i++) {
            h = (h * d) % q;

        }

        for (i = 0; i < m; i++)
        {
            p = (d*p + a.charAt(i))%q;
            System.out.println(p);
            t = (d*t + s.charAt(i))%q;
        }

       // System.out.println(t);
    }
}
