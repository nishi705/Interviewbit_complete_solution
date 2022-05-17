package Array;

public class Reading_Newspaper {
    public static void main(String[] args) {
    int[] B = {15, 20, 20, 15, 10, 30, 45};
    int A = 100;

    int j=0;
    while(A > 0){
        for(int i=0;i<B.length;i++){
            if(B[i]>=A){
                j=i+1;
                //System.out.println(j);
            }else{
                A=A-B[i];
            }
        }
    }
        System.out.println(j);
    }
}
