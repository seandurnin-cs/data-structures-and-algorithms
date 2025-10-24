public class powerSpeedComparison
{
    public static void main(String args[])
    {
        long n1 = 100;
        long n2 = 100;

        long start1 = System.nanoTime();
        System.out.println("recursivePower: " + recursivePower(n1,n2));
        long end1 = System.nanoTime();
        System.out.println("Time taken: " + (end1 - start1));
        
        long start2 = System.nanoTime();
        System.out.println("iterativePower: " + iterativePower(n1,n2));
        long end2 = System.nanoTime();
        System.out.println("Time taken: " + (end2 - start2));
    }

    public static long recursivePower(long n, long p)
    {
        if(p == 0)
        {
            return 1;
        }
        else
        {
            return n * recursivePower(n, p-1);
        }
    }

    public static long iterativePower(long n, long p)
    {
        long r = n;
        for(int i = 0; i < p-1; i++)
        {
            r = r * n;
        }
        return r;
    }
}