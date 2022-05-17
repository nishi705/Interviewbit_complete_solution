package Beginners_Batch.Advance.Maths;



public class find_the_gcd_of_the_subsequences {
    public static void main(String[] args) {

        int a[] = {12, 15, 18 };
        callsubsequencegcd(a);
    }

    private static void callsubsequencegcd(int[] a) {
        int n = a.length;
        System.out.print(a[n-1]);
        int Prefix[] = new int[n+2];
        Prefix[0] = a[0];
        for (int i = 1; i <= n; i += 1)
        {
            Prefix[i] = getgcd(Prefix[i - 1], a[i - 1]);
        }
      for(int i=1;i<Prefix.length-1;i++){
          //System.out.print(Prefix[i]+" ");
      }
    }

    private static int getgcd(int a, int b) {

        if(b==0)
            return a;

       return getgcd(b, a % b);
    }

}
