public class dectobin {
    public static void decimal_to_binary(int n) {
        int myNum = n;
        int pow=0;
        int binary=0;
        while (n>0){
            int rem = n % 2;
            binary= binary + (rem * (int)Math. pow(10, pow));
            pow++;
            n = n/2;
        }
        System.out.println("binary to decimal" + myNum + "=" + binary);
    }
    public static void main(String[] args) {
        decimal_to_binary(5);
    }
}
