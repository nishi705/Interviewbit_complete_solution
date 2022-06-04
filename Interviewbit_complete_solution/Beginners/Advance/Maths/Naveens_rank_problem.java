package Beginners_Batch.Advance.Maths;

import java.util.Arrays;

public class Naveens_rank_problem {
    public static void main(String[] args) {
      //  String s = "gTFAMYjxCewRlftmGOKJHUuhSBVDZnbqyoPQadEkLrpNsv";
          String s = "ibytes";
        if(s.length() ==1 )
        {
           // System.out.println(1);
        }
        String str=s;
        char[] strChar = str.toCharArray();
        Arrays.sort(strChar);
        String sorted = new String(strChar);
        //System.out.println(str);
        long count  =1;
        int i=0;
        while(sorted.length() > 1) {
            //System.out.println(sorted);
            if(str.charAt(i) == sorted.charAt(0)){
               //System.out.println(sorted.charAt(0));
                sorted= sorted.split(str.charAt(i)+"")[1];
                System.out.println(sorted);

            }else {
                int indexinSorted = 1;
                for(int j=0;j<sorted.length();j++) {
                    indexinSorted = j;
                    if(sorted.charAt(j) == str.charAt(i)) {
                        //System.out.println("breaking :"+sorted.charAt(j) );
                        break;
                    }
                }
                //System.out.println(indexinSorted);
                long  length = str.length()-i-1;
                //System.out.println("length :"+length);

                long looplength=length-1;;
                while(looplength > 0) {
                    length*=looplength;
                    length%=1000003;
                    looplength--;
                }


                //System.out.println("fract :"+length);



                count= (count+ ((length*indexinSorted)% 1000003)) % 1000003;
                sorted= sorted.replace(str.charAt(i)+"", "");

            }

            i++;
        }

       // System.out.println((int)( (count+1000003)   % 1000003));
    }
}
