package Beginners_Batch.Advance.Maths;

public class Greated_Prime_factor_of_n {
    public static void main(String[] args) {
        int A = 25;

        int g = 0;
       // int mod = 1000000007;
        for (int i = 0; i <= A; i++) {
            g = Math.max(g,i);
        }
        int[] spf = new int[g + 1];

        for (int i = 0; i < spf.length; i++) {
            spf[i] = i;
        }


        for (int i = 2; i * i <= g; i++) {
            for (int j = i * i; j <= g; j += i) {
                if (spf[j] == j) {
                    spf[j] = i;
                    System.out.println(spf[j]);
                }
            }
        }

//        for(int i=0;i<spf.length;i++){
//            if(spf[i]==i){
//                System.out.println(spf[i]);
//            }
//        }
    }
}
