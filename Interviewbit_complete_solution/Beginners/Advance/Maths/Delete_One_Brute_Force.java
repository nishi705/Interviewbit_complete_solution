package Beginners_Batch.Advance.Maths;

public class Delete_One_Brute_Force {
    static int GCD(int a, int b){

        if (a == 0) {

            return b;
        }
        return GCD(b%a,a);

    }
    public static void main(String[] args) {

        int[] A = {5, 15, 30};
        int x1 = findGCD(A);
        int x2 = findGCDsec(A);
        int res = Math.max(x1,x2);


        int index= 1;
        while(index <A.length-1){
            int ele1 =-1;
            int ele2 = -1;
            ele1 =index-1;
            ele2 = index+1;





            int cds = GCD(A[ele1],A[ele2]);

            if(ele1 < index && ele1 > 0){
                for(int j=0;j<ele1;j++){
                    cds= GCD(cds,A[j]);
                }

            }

            for( int i=index+1;i<A.length;i++){
                cds = GCD(cds,A[i]);
            }

            res = Math.max(cds,res);
            index++;


        }

        System.out.println(res);





    }

    private static int findGCD(int[] A) {
        int x = A[1];
        for(int i=2;i<A.length;i++){
            x = GCD(x,A[i]);

            if(x==1){
                return (x);
            }
        }
        return (x);
    }
    private static int findGCDsec(int[] A) {
        int x = A[0];
        for(int i=1;i<A.length-1;i++){
            x = GCD(x,A[i]);

            if(x==1){
                return (x);
            }
        }
        return (x);
    }
}
