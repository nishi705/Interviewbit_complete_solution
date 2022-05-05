package Array;

public class Range_sum_query {
    public long[] rangeSum(int[] A, int[][] B) {

        long n=B.length;
        long arr[]=new long[(int)n];
        long ps[]=new long[(int)A.length];
        ps[0]=A[0];
        for(int i=1;i<A.length;i++){
            ps[i]=A[i]+ps[i-1];
        }
        for(int i=0;i<B.length;i++){
            int r=B[i][0]-1;
            int c=B[i][1]-1;
            if(r==0 ){
                arr[i]=ps[c];
            }else if(c==A.length-1 && r==0){
                arr[i]=ps[c-1];
            }else{
                arr[i]=ps[c]-ps[r-1];
            }
        }
        return arr;


    }
}
