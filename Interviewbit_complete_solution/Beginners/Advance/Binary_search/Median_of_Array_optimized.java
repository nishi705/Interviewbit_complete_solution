package Beginners_Batch.Advance.Binary_search;

import java.util.List;

public class Median_of_Array_optimized {
    public double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {

        int n = a.size();
        int m = b.size();
        if (n > m)
            return findMedianSortedArrays(b, a);

        int low = 0;
        int high = n;

        while(low<=high){

            int cut1 = (low+high)/2;
            int cut2 = cut2 = (n + m +1) / 2 - cut1;

            int l1 = (cut1==0?Integer.MIN_VALUE:a.get(cut1-1));
            int l2 = (cut2==0?Integer.MIN_VALUE:b.get(cut2-1));
            int r1 = (cut1==n?Integer.MAX_VALUE:a.get(cut1));
            int r2 = (cut2==m?Integer.MAX_VALUE:b.get(cut2));

            if(l1<=r2 && l2<=r1){
                if((n+m)%2==0){
                    return (Math.max(l1,l2) + (Math.min(r1,r2)))/2.0;
                }else{
                    return Math.max(l1,l2);
                }
            }else if(l1>r2){
                high = cut1-1;
            }else{
                low = cut1+1;
            }
        }

        return 0.0;
    }


}
