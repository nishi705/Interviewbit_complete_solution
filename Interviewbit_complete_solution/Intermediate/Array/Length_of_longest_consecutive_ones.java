package Array;

public class Length_of_longest_consecutive_ones {

    public static void main(String[] args) {
        String A = "1111";

        int N = A.length();
        int count =0;
        for(int k=0;k<A.length();k++){
            if(A.charAt(k) == '1'){
                count++;
            }
        }
       if(count == A.length()){
           System.out.println(N);
       }
       else {

           int ans = 0;
           int l = 0;
           int r = 0;
           int len = 0;
           for (int i = 0; i < A.length(); i++) {
               if (A.charAt(i) == '0') {

                   l = 0;
                   for (int j = i - 1; j >= 0; j--) {
                       if (A.charAt(j) == '1') {
                           l++;
                       } else {
                           break;
                       }
                   }


                   r = 0;
                   for (int m = i + 1; m < A.length(); m++) {
                       if (A.charAt(m) == '1') {
                           r++;
                       } else {
                           break;
                       }
                   }

               }


               if (count > l + r) {
                   len = l + r + 1;

               } else {
                   len = l + r;
               }

               ans = Math.max(ans, len);

           }
           System.out.println(ans);
       }

    }
}
