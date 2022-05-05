package Array;

public class Length_Of_the_Maximum_Consecutive_ones {
    public static void main(String[] args) {

        String str = "1110110011110";

        int N = str.length();
        int count =0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1'){
                count++;
            }
        }

        if(count== N){
            System.out.println(N);
        }
        else{
            int len =0;
            int l= 0;
            int r=0;
            int ans =0;
            for(int  i=0;i<str.length();i++){
                if(str.charAt(i)=='0'){
                    //count left 1:
                    l=0;
                    for(int j=i-1;j>=0;j--){
                        if(str.charAt(i)=='1'){
                            l++;
                        }
                        else{
                            break;
                        }
                    }

                    //count the ryt one:
                    r=0;
                    for(int j=i+1;j<str.length();j++){
                        if(str.charAt(j)=='1'){
                            r++;
                        }
                        else{
                            break;
                        }
                    }

                    ans= Math.max(ans,l+r+1);
                    //System.out.println(ans);
                }
            }
            System.out.println(ans);
        }
    }
}
