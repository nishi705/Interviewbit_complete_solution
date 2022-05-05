package SubArray;

public class Iterate_over_all_the_subarrays {

    public static void main(String[] args) {
        int[] A= {3,4,-1,6,7,8,9,3,2,-1,4};
        int N = A.length;
        int k=6;
        int start = 0;
        int end = k-1;

      while(start < (N-k)){
          System.out.println("start"+ "=" + start + "end" + "=" + end);
          start++;
          end++;
      }
    }

}
