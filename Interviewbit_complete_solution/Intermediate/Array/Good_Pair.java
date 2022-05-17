package Array;

import java.util.Arrays;
import java.util.HashSet;

public class Good_Pair {
    //Third method
    static int using_hashing(int[] A,int B){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<A.length;i++){
            if(set.contains(B-A[i])){
                return 1;
            }else{
                set.add(A[i]);
            }
        }
        return 0;

    }
    //Second method using sorting and two pointers
    static int sorting_and_two_pointer_technique(int[] A,int B){
            Arrays.sort(A);
            int i=0;
            int j=A.length-1;
            while(i<j){
                if(A[i]+A[j]==B){
                    return 1;
                }else if(A[i]+A[j]<B){
                    i++;
                }else{
                    j--;
                }
            }
            return 0;
        }
    public int solve(int[] A, int B) {
        int n = A.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(A[i]+A[j]==B)
                    return 1;
            }
        }
        return 0;
    }
}
