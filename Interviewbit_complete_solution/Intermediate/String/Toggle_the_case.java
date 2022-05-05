package String;

public class Toggle_the_case {
    public static void main(String[] args) {
        String s = "aBcEghR";
           char[] c = s.toCharArray();
        for(int i=0;i<c.length;i++){
            c[i] = (char) (c[i]^32);
        }
        System.out.println(String.valueOf(c));
    }
}
