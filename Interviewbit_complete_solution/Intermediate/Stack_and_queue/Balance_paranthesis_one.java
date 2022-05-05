package Stack_and_queue;
/*
Given a string A consisting only of '(' and ')'.

You need to find whether parentheses in A are balanced or not,
if it is balanced then return 1 else return 0.
 */

public class Balance_paranthesis_one {
    public static void main(String[] args) {
        String  A = "(())";
        int flag =1;
        int count =0;
        for(int i=0;i<A.length();i++){
            if (A.charAt(i) == '(')
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        System.out.println(count);
//       if(count!=0){
//           flag =0;
//       }else{
//           System.out.println(count);
//       }
    }

}
