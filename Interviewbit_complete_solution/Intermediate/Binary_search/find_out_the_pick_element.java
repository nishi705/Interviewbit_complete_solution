package Binary_search;

public class find_out_the_pick_element {
    public static void main(String[] args) {
        int[] A= { 8, 9, 10, 2, 5, 6 };

        int s = 0;
        int e = A.length-1;
        int mid = (s+e)/2;
        while(s<e){

            if(mid+1 <= A.length){
                if(A[mid]>A[mid+1]){
                    e=mid-1;
                }else{
                    s=mid+1;
                }
            }else{
                if(A[mid-1]>A[mid]){
                    e=mid-1;
                }else{
                    s=mid+1;
                }
            }
        }
        System.out.print(mid);
    }
}
