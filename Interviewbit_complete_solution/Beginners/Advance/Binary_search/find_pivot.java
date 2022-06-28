package Beginners_Batch.Advance.Binary_search;

public class find_pivot {
    static int findPivot(int[] A,int high,int low){
        if (high < low)
            return -1;
        if (high == low)
            return low;

        /* low + (high - low)/2; */
        int mid = (low + high) / 2;
        if (mid < high && A[mid] > A[mid + 1])
            return mid;
        if (mid > low && A[mid] < A[mid - 1])
            return (mid - 1);
        if (A[low] >= A[mid])
            return findPivot(A, low, mid - 1);
        return findPivot(A, mid + 1, high);

    }
    public static void main(String[] args) {
        int[] A = {186, 192, 193, 202, 204, 2, 3, 6, 10, 11, 12, 17, 21, 28, 29,
                30, 31, 32, 37, 38, 39, 40, 41, 47, 49, 50, 51, 52, 55, 57, 58, 59, 60, 65, 67, 68, 71,
                72, 74, 77, 78, 80, 82, 83, 88, 89, 90, 94, 100, 107, 108, 109, 111, 112, 114, 115, 116, 118,
                119, 121, 123, 124, 126, 129, 133, 134, 135, 137, 138, 144, 147, 148,
                150, 151, 154, 156, 159, 161, 163, 165, 166, 167, 168, 169, 174, 178, 180, 182, 183, 185};


        int pivot = findPivot(A,0,A.length-1);
        System.out.println(pivot);
    }
}
