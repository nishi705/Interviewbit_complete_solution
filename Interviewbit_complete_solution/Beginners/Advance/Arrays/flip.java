package Beginners_Batch.Advance.Arrays;

import java.util.ArrayList;

public class flip {
    public ArrayList<Integer> flip(String A) {
        /*
        given a binary string,in one operation we can choose two indices L & R such that
         L and R belong in range 1 to n
         we have to perform atmost one operation so that final string number has maximised
          return the answer in bsed indexing

          explanation:
          we need to take the range and flip the bit
          1100100 -> 1011100
          her we are fliping 2,3,4 character, like that we need to find the subarray having maximum
          number of one with L and R

          observation:
          lets take 1-> -1:
                    0-> 1

                    suppose we have "11000" and we recreate it as "-1-1111
                    case1: from rage 1 to 5 total sum = 1
                    case2: from range 3 to 5 total sum = 3

                    so, we need tof ind out the maximum sum subarray (KADANS ALGO)
                 and we need to return the start and end index of that array having maximum number of 1;
         */

        /*
        approach:
        kadans algo + two pointers

        result[]
         if(A[i]=='1') then result[i] = -1; (coz 1->-1 and 0->1)
         if(A[i]=='0') then result[i] = 0

         curr =0;
         best =0;
         l=0;
         r=0;
         for(int i=0;i<n;i++){
         cur = sur+A[i];
         if(cur<0) (means cur can be negative number also in that case we will not cosider that and we increase index;)

           else if(cur>best) (means we can get the more best and
           l= idx;
           r = i; (eg: basically uing idx and i we will get the range)
         best = cur;
          if(r!= -1) (means we found valid ans)
          return l+1,r+1;
          else
          return {};
         */
        String s = "101";

        int l=0;
        int r=0;
        int cur =0;
        int max =0;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                cur--; //here cur-- because '1' here we are taking as -1;
            }else{
                cur++;
            }
            if(cur>max){
                al.set(0,l+1);
                al.set(1,r+1);
                max =cur;
            }if(cur<0){
                cur=0;
                l++;
                r++;
            }
            r++;//here we are increamenting r because we need subaaray l will be static and r will increase;
        }
        if(max==0) {
            return new ArrayList<Integer>();
        }
        return al;
    }
}
