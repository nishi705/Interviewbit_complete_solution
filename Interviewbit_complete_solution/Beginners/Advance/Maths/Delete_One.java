package Beginners_Batch.Advance.Maths;

public class Delete_One {
        static int GCD(int a, int b){

            if (a == 0) {

                return b;
            }
            return GCD(b%a,a);

        }
        public static void main(String[] args) {
            int[] A = {7,14};
            int n = A.length;
            int[] prefix = new int[A.length+1];
            prefix[1] = A[0];
            for(int i=2;i<=A.length;i++){
               prefix[i] = GCD(prefix[i-1],A[i-1]);

            }
            int[] suffix = new int[A.length+2];

            suffix[n] = A[n -1];

            for(int i=n-1;i>=1;i--){
                suffix[i] = GCD(suffix[i+1],A[i-1]);

            }
           int ans =  Math.max(suffix[2], prefix[n- 1]);
            for (int i = 2; i < n; i += 1)
            {
                ans = Math.max(ans, GCD(prefix[i - 1], suffix[i + 1]));

            }
            System.out.println(ans);

        }
        private static int findGCD(int[] A){
            int x = A[0];
            for (int i = 0; i < A.length; i++) {
                x = GCD(x, A[i]);

                if (x == 1) {
                    return (x);
                }
            }
            return (x);

        }

}
