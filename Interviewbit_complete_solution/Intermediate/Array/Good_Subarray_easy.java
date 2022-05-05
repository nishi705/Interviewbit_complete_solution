package Array;

public class Good_Subarray_easy {

    public int solve(int[] A, int B) {

        int count =0;
        int sum =0;
        int len =0;
        for(int i=0;i<A.length;i++){
            sum =0;
            len =0;
            for(int j=i;j<A.length;j++){
                len++;
                sum+= A[j];
                if(len%2==0){
                    if(sum<B){
                        count++;
                    }
                }

                else if(len%2 !=0){
                    if(sum>B){
                        count++;
                    }
                }
            }

        }

        return count;

    }

}
