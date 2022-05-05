package Maths;

public class Mod_String {
    public static void main(String[] args) {

        String A ="143";
        int B = 2;

        int num,rem =0;
        for(int i=0;i<A.length();i++){
            //'0' represent the value zero
            num = rem * 10 + (A.charAt(i) - '0');
            rem = num % B;
        }
        System.out.println('1'-'0');
       // System.out.println(rem);
    }
}
