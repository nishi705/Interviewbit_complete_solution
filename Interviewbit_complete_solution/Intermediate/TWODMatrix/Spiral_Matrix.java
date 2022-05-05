package TWODMatrix;

public class Spiral_Matrix {
    public static void main(String[] args) {
        int A=2;
        int k,l,m,n;
        int[][] temp = new int[A][A];
         k=0;
         l=0;
         m=A;
         n=A;
        int val=1;

        while(val<=A*A){

            for(int i=l;i<n;++i){
                temp[k][i] = val;
                val++;
            }
            k++;

            for(int i=k;i<m;++i){
                temp[i][n-1] = val;
                val++;
            }
            n--;

            if(k<m){
                for(int i=n-1;i>=l;--i){
                    temp[m-1][i] = val;
                    val++;
                }
                m--;
            }

            if(l<n){
                for(int i=m-1;i>=k;--i){
                    temp[i][l] = val;
                    val++;
                }
                l++;
            }

        }

        for(int i=0;i<A;i++){
            for(int j=0;j<A;j++){
                System.out.print(temp[i][j]);
            }
            System.out.println();
        }

    }
}
