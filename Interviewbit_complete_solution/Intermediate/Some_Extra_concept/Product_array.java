package Some_Extra_concept;

public class Product_array {
    public static void main(String[] args) {
        //Lets try to make product array
//        int[] arr = {1,2,3,4};
//        int[] pa = new int[arr.length];
//        int prodct = 1;
//        pa[0] = arr[0];
//        for(int i=1;i<arr.length;i++){
//            prodct = pa[i-1]*arr[i];
//            pa[i] = prodct;
//        }
//
//        for(int i=0;i<pa.length;i++){
//            //System.out.println(pa[i]);
//        }

       // System.out.println();
        //Lets try with given number
        int a = 1234;
        String s = String.valueOf(a);
        int product;
        for(int i=0;i<s.length();i++){
            product = 1;
            for(int j=i;j<s.length();j++) {
                int val = s.charAt(j) - '0';
                product = product * val;
                System.out.println(product);
            }

        }

    }
}
