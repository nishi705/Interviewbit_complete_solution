package Maths;

public class divisible_by_8 {
    static boolean check(String str)
    {
        int n = str.length();
        if (n == 0)
            return false;
        if (n == 1)
            return ((str.charAt(0)-'0')%8 == 0);
        if (n == 2)
            return (((str.charAt(n-2)-'0')*10 + (str.charAt(n-1)-'0'))%8 == 0);
        int last = str.charAt(n-1) - '0';
        int second_last = str.charAt(n-2) - '0';
        int third_last = str.charAt(n-3) - '0';

        return ((third_last*100 + second_last*10 + last) % 8 == 0);
    }

    public int solve(String A) {

        if(check(A))
            return 1;
        else
            return 0;

    }
}
