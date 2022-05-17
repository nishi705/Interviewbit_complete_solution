package SubsetAndSubsequences;

public class Little_Ponny_and_Subsequence {
    public static void main(String[] args) {
        String A = "abcdsfhjagj";
        int n = A.length();
        char min='z',max ='z';
        String res = "";
        for(int i=0 ; i < n ; i++){
            if( i != n-1 && A.charAt(i) < min){
                min = A.charAt(i);
                //System.out.print(min);
            }else if( i != 0 && A.charAt(i)< max){
                max = A.charAt(i);
                System.out.println(max);
            }
        }
        res = res + min;
        res = res + max;
        //System.out.print(res);
    }
}
