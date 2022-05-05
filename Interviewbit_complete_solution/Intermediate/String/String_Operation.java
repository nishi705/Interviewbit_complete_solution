package String;

public class String_Operation {
    public String solve(String A) {

        A = A.concat(A);
        String b = delete_vowels(A);
        String d = insert_hash(b);
        return d;
    }
    static String delete_vowels(String s) {
        char[] c = s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i] =='a' || c[i] =='e' || c[i] =='i' || c[i] =='o' || c[i] =='u'){
                c[i] = '#';
            }
        }
        return String.valueOf(c);
    }
    static String insert_hash(String s){
        s = s.replaceAll("[A-Z]", "");
        return  s;
    }
}