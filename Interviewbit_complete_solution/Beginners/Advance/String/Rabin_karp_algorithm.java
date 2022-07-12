package Beginners_Batch.Advance.String;

public class Rabin_karp_algorithm {
    static  int powerec(int i,int j){

        if(i==0)return 0;
        if(j==0)return 1;

        return i*powerec(i,j-1);

    }
    static int findstring(String pattern){
        int sum =0;

        for(int i=0;i<pattern.length();i++){
            int res = pattern.charAt(i)* powerec(29,i);
            sum = sum+res;
        }
        return  sum;
    }
    public static void main(String[] args) {
        String text = "abcdabcdacda";
        String pattern = "cda";
        int window_length = pattern.length();
        int x = findstring(pattern);
        //System.out.println(x);
        //x is hashcode for patten
        //lets match the pattern with given string
        int sum =0;
        int count =0;
        for(int i=0;i<window_length;i++){
            int res = text.charAt(i)* powerec(29,i);
            sum = sum+res;
        }
        if(sum==x){
            count++;
        }
        //System.out.println();
        int ans = sum;
        int index =0;

        for(int i=window_length;i<text.length();i++){
            sum = sum - text.charAt(index);
            sum = sum/29;
            sum = sum + text.charAt(i) * powerec(29,window_length-1);

            //System.out.println(sum);

            if(sum==x){
                count++;
            }

            index++;
        }
       System.out.println(count);
    }
}
