public class sigma
{
    public static void main(String args[])
    {
        int n = 5;
        System.out.println(sigmaM(n));
    }

    public static int sigmaM(int x)
    {
        if(x > 1)
        {
            return x + sigmaM(x-1);
        }
        else
        {
            return 1;
        }
    }
}