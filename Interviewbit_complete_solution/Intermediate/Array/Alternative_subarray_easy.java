package Array;
/*
You are given an integer array A of length N comprising of 0's & 1's, and an integer B.
You have to tell all the indices of array A that can act as a center
of 2 * B + 1 length 0-1 alternating subarray.
A 0-1 alternating array is an array containing only 0's & 1's, and having no
adjacent 0's or 1's. For e.g. arrays [0, 1, 0, 1], [1, 0] and [1] are 0-1 alternating,
while [1, 1] and [0, 1, 0, 0, 1] are not.
 */
public class Alternative_subarray_easy {
    public static void main(String[] args) {
        int[] A = {1,0,1,0,1};
        int[] N = new int[A.length];
        int B = 1;
       int mid =0;
       int k=0;
        for(int i=0;i<A.length;i++){
            if(B==0){
                N[i] = i;
            }
            else{
                int s =i;
                int e = s+ 2*B+1;
                boolean  f = true;
                while(e<A.length){
                    int j=s;
                    for(j=j+1;j<e;j++){
                        if(A[j]==A[j-1]){
                            f= false;
                            break;
                        }
                        else{
                            f=true;
                        }
                    }
                    if(f==true){
                        mid = Math.abs((s+e)/2);
                        N[k++] = mid;
                    }
                }
            }
        }

        for(int i=0;i< 2*B+1;i++){
            System.out.println(N[i]);
        }


    }

}
