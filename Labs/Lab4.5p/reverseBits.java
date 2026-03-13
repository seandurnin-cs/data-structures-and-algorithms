
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
        String nStr = Integer.toBinaryString(n);
        while(nStr.length() < 31) {
            nStr = "0" + nStr;
        }

        StringBuilder reversed = new StringBuilder(nStr);

        reversed.reverse();
        nStr = reversed.toString();
        return Integer.parseInt(nStr, 2);

    }
}
