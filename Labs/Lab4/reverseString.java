public class reverseString
{
    public static void main(String args[])
    {
        String str = "window";

        System.out.println(reverse(str));
    }

    public static String reverse(String x)
    {
        if(x.length() > 1)
        {
            return x.substring(x.length()-1) + reverse(x.substring(0,x.length()-1));
        }
        else
        {
            return x;
        }
    }
}