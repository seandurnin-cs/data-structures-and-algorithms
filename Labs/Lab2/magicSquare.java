import java.util.Scanner;
public class magicSquare
{
    public static void main(String args[])
    {
        int size;

        Scanner uI = new Scanner(System.in);

        //declare matrix
        System.out.println("Enter size of matrix (n): ");
        size = uI.nextInt();
        int [][] square = new int[size][size];

        //fill matrix
        System.out.println("Enter matrix elements: ");
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                System.out.println("Enter element at row " + (i+1) + ", column " + (j+1));
                square[i][j] = uI.nextInt();
            }
        }

        //result
        System.out.println("You entered:");
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }

        if(isMagic(square))
        {
            System.out.println("The square is a magic square!");
        }
        else
        {
            System.out.println("The square is NOT a magic square!");
        }

    }

    public static boolean isMagic(int x[][])
    {
        int size = x.length;
        int rowA[] = new int[x.length];
        int colA[] = new int[x.length];
        int diagP = 0;
        int diagS = 0;

        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                rowA[i] += x[i][j];
                colA[j] += x[i][j];
                if(i == j)
                {
                    diagP += x[i][j];
                }
                if(i + j == (size - 1))
                {
                    diagS += x[i][j];
                }
            }
        }

        for(int i = 0; i < size; i++)
        {
            if(rowA[0] != rowA[i] || rowA[0] != colA[i] || (rowA[0]) != (diagP) || (rowA[0]) != (diagS))
            {
                return false;
            }
        }
        return true;
    }
}