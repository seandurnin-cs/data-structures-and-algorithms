import java.util.*;
public class sortMade
{
    public static void main(String args[])
    {
        Scanner uI = new Scanner(System.in);
        int a[] = new int[1000];
        for(int i = 0; i < a.length; i++)
        {
            int rand = new java.util.Random().nextInt(101); 
            a[i] = rand;
        }

        insertionSort(a);

        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }


    }

    public static void bubbleSort(int x[])
    {
        int temp = 0;
        for(int i = 0; i < x.length; i++)
        {
            for(int j = 1; j < x.length; j++)
            {
                if(x[j-1] > x[j])
                {
                    Swap(j, j-1, x);
                }
            }
        }
    }

    public static void selectionSort(int x[])
    {
        int min = 0;
        for(int i = 0; i < x.length; i++)
        {
            min = i;
            for(int j = i + 1; j < x.length; j++)
            {
                if(x[j] < x[min])
                {
                    min = j;
                }
            }
            Swap(i, min, x);
        }
    }

    public static void Swap(int a, int b, int x[])
    {
        int temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }

    public static void insertionSort(int x[])
    {
        for(int i = 1; i < x.length; i++)
        {
            int key = x[i];
            int j = i - 1;
            while(j >= 0 && x[j] > key)
            {
                x[j+1] = x[j];
                j--;
            }
            x[j+1] = key;
        }
    }
}