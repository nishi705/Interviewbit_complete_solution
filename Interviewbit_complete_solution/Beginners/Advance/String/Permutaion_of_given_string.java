package Beginners_Batch.Advance.String;

public class Permutaion_of_given_string {
    static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
    static void getpermu(String s,int l,int r){
        if(l==r){
            System.out.println(s);
        }else{
            for(int i=l;i<r;i++){

                s = swap(s,l,i);
                getpermu(s,l+1,r);
                s = swap(s,l,i);
            }
        }
    }
    public static void main(String[] args) {
        String s = "ABC";
        int l =0;
        int r =s.length();

        getpermu(s,l,r);
    }
}
