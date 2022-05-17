package Beginners_Batch.Advance.Maths;

public class Given_N_find_the_smallest_prime_factor_for_all_the_numbers_from_two_to_N {
    public static void main(String[] args) {
        int[] A={2,3,4,5};

        int n= A.length;
        int[] spf = new int[n+1];

        for(int i=1;i<=A.length;i++){
            spf[i] = i;
        }

        for(int i=2;i*i<=A.length;i++){
            if(spf[i]==i){
                for(int j=i*i;j<=A.length;j+=i){
                    if(spf[j]==j){
                        spf[j]=i;
                    }
                }
            }
        }


        for(int i=2;i<spf.length;i++){
            System.out.print(spf[i]+" ");
        }
    }

}
