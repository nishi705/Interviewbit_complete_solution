package Maths;

public class Find_Excel_column_number_from_column_title {
    public int titleToNumber(String A) {

        int result =0;
        for(int i=0;i<A.length();i++){
            result*= 26;
            result= result+ (A.charAt(i) - 'A') + 1;
        }
        return result;
    }
}
