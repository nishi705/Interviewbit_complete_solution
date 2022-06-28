package Beginners_Batch.Advance.String;

public class Kth_Symbolr {
    static int callkthsymbol(int n, int k){
        if(n==0 || k==0) return 0;

        int x;
        if ((k & 1) == 0) { // even or odd
            x = callkthsymbol(n - 1, k / 2) == 0 ? 1 : 0;
        } else {
            x = callkthsymbol(n - 1, (k + 1) / 2);
        }
        return x;

    }
    public static void main(String[] args) {
          int n = 5;
          int k =8;

      int x = callkthsymbol(n,k);
        System.out.println(x);

    }
}
