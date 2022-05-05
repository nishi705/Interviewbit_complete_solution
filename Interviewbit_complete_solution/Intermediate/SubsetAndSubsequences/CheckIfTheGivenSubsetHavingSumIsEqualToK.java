package SubsetAndSubsequences;

public class CheckIfTheGivenSubsetHavingSumIsEqualToK {
    static boolean checkBit(int i, int j){
        if((i&(1<<(j)))!=0)
            return true;
        return false;
    }
    public static void main(String[] args) {
        int[] A={-2,6,4};
        int n= A.length;
        int k=10;
        int sum=0;
        for(int i=0;i< Math.pow(2,n);i++) {
            sum = 0;
            for (int j = 0; j < n; j++) {
                if (checkBit(i, j)) {
                    sum += A[j];
                }
            }
            if(sum==k){
                System.out.println("yes");
            }else{
                System.out.println("No");
            }
        }




    }
}
