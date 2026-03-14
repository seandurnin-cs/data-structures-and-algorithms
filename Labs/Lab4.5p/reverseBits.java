public class reverseBits {

    public static void main(String args[]) {
        int num1 = 43261596;
        int num2 = 2147483644;
        int reverse1 = reverseBits(num1);
        int reverse2 = reverseBits(num2);
        System.out.println(reverse1);
        System.out.println(reverse2);
    }

    public static int reverseBits(int n) {
        int x = 0;
        for(int i = 0; i < 31; i++) {
            x = x + (n & 1);
            x = x << 1;
            n = n >>> 1;
        }
        return x;
    }
}
