package Binary_search;

public class search_an_element_using_binary_search {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 10;
        int i = BinarySearch(arr,x);
        System.out.print(i);
    }

    private static int BinarySearch(int[] arr, int x) {

        int i=0;
        int j = arr.length-1;

        while(i<j){
            int mid = (i+j)/2;

            if(arr[mid]==x){
                return mid+1;
            }
            else if(arr[mid]<x){
                i = mid+1;
            }else{
                j = mid-1;
            }
        }
        return -1;
    }
}
