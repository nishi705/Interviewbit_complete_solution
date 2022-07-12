package Beginners_Batch.Advance.Bit_Manupulation;

public class Single_number_2 {
    public static void main(String[] args) {
        /*
        in this first loop will run from 1 to 32
        inner loop will from 10 n
        by using set bit (msb) means (if the left sift of 1 by i) & A[i]>0
        count++;
        using above condition get the count
        if count%3=0 means we got that value which is singly present
        ans = ans|(count<<i) will return the exact value;
         */
        int[] A= {1, 2, 4, 3, 3, 2, 2, 3, 1, 1};
        int ans =0;
        for(int i=0;i<32;i++)
        {   int cnt=0;
            for(int j=0;j<A.length;j++)
            {
                if((A[j] & (1<<i))>0)
                    cnt++;
            }
            cnt=cnt%3;
            ans=ans|(cnt<<i);
        }
        System.out.println(ans);
    }
}
