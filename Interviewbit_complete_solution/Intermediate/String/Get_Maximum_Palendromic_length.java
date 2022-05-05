package String;

public class Get_Maximum_Palendromic_length {
    static int getpallength(String A,int i,int j) {
        while (i >= 0 && j < A.length() && A.charAt(i) == A.charAt(j)) {
            i--;
            j++;
        }
        return j-i-1;
    }
    public String longestPalindrome(String A) {
        int ans =0;
        int mid =0;
        for(int i=0;i<A.length();i++){
            int len1 = getpallength(A,i,i);
            len1 = Math.max(len1,getpallength(A,i,i+1));
            if(ans<len1){
                ans = Math.max(len1,ans);
                mid = i;
            }

        }

        if(ans % 2 == 0) return (A.substring(mid + 1 - ans/2, mid + 1 + ans/2));
        return A.substring(mid - ans/2 , mid + ans/2 + 1);
    }
}
