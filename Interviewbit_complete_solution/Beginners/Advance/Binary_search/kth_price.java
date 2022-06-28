package Beginners_Batch.Advance.Binary_search;

public class kth_price {
    static int findCount(int[] A,int B){
        int count = 0;
        for(int num : A){
            if(num <= B) count++;
        }
        System.out.println(count);
        return count;
    }
    public static void main(String[] args) {
        int[] A= {2,1 ,4 ,3, 2};
        int B = 4;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<A.length;i++){
            min = Math.min(min,A[i]);
            max = Math.max(max,A[i]);
        }

//        System.out.println(min);
//        System.out.println(max);
        int ans = max;
        while(min<=max){
            int mid = min + (max-min)/2;
            int count = findCount(A, mid);
            if(count >= B){
                ans = mid;
                max = mid-1;
            }else{
                min = mid+1;
            }
        }
        //System.out.println(ans);
    }
}
