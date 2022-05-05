package Beginners_Batch.Advance;

public class Pick_from_both_sides {
    public int solve(int[] A, int B) {
        int sum1=0;
        int sum2=0;
        int min1;

        for(int i=0;i<A.length;i++){
            sum1+=A[i];
        }
        int i=0;
        int j=A.length-B-1;

        for(int k=i;k<=j;k++){
            sum2+=A[k];
        }

        min1=sum2;
        i++;
        j++;
        while(j<A.length){
            sum2+=(A[j]-A[i-1]);
            min1=Math.min(sum2,min1);
            i++;
            j++;
        }
        return (sum1-min1);
    }
}
