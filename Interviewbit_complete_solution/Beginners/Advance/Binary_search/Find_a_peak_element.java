package Beginners_Batch.Advance.Binary_search;

public class Find_a_peak_element {
    static int pickpeek(int[] A){
        int n= A.length;
        int l = 0;
        int r = n-1;
        int mid=0;
        while (l <= r) {
            mid = (l + r)/ 2;
            System.out.println(mid);
            if ((mid == 0 || A[mid - 1] <= A[mid] && (mid == n - 1 || A[mid + 1] <= A[mid])))
                return A[mid+1];
            if (mid > 0 && A[mid - 1] > A[mid])
                r = mid - 1;
            else
                l = mid + 1;
        }
        return A[mid];
    }
    public static void main(String[] args) {
        int[] A={2,3};
        int a = pickpeek(A);
        System.out.println(a);

    }
}
