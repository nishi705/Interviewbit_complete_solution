package Array;

public class Maximum_positivity {
    public int[] solve(int[] A) {

        int[] N = new int[A.length];

        int start =0;
        int end =0;
        int max =0;
        int value =0;
        int s =0;
        int k=0;

        for(int i=0;i<A.length;i++){
            if(A[i] < 0){
                s= i+1;
                max = 0;
            }
            else{
                max+= 1;
            }
            if(max>value){
                value = max;
                start = s;
                end = i;

            }
        }
        N = new int[end-start+1];

        for(int i= start;i<=end;i++){
            N[i-start] = A[i];
        }
        return N;

    }
}
