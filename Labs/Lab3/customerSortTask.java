/*
 * CustomerSorting.java
 * 
 * Demonstrates sorting of Customer objects using standard algorithms.
 * Supports sorting by:
 *   1. First name
 *   2. Age
 *   3. First name, then surname
 *
 * Highlights comparison logic and algorithm adaptation for object arrays.
 */
import java.util.Scanner;
public class customerSortTask
{
    static Scanner uI = new Scanner(System.in);
    public static void main(String args[])
    {
        Customer[] customers = 
        {
            new Customer("John", "Smith", 30),
            new Customer("Alice", "Brown", 25),
            new Customer("Bob", "Adams", 28),
            new Customer("Diana", "Clark", 35),
            new Customer("Diana", "Davis", 22),
            new Customer("Adam", "Smith", 51),
            new Customer("Mary", "Walsh", 18),
            new Customer("Adam", "Reed", 32),
            new Customer("Carl", "English", 29),
            new Customer("Bob", "Gates", 20)
        };

        sortCustomers(customers);

        for(Customer c : customers)
        {
            c.display();
        }

    }

    public static void sortCustomers(Customer x[])
    {
        System.out.print("What would you like to sort by? \nOPTIONS: name, surname, age");
        System.out.println();
    
        String userChoice = uI.nextLine();
        if(userChoice.equalsIgnoreCase("name"))
        {
            for(int i = 1; i < x.length; i++)
            {
                Customer key = x[i];
                int j = i - 1;
                while(j >= 0 && x[j].name.compareTo(key.name) > 0)
                {
                    x[j+1] = x[j];
                    j--;
                }
                x[j+1] = key;
            }
        }
        else if(userChoice.equalsIgnoreCase("surname"))
        {
            for(int i = 1; i < x.length; i++)
            {
                Customer key = x[i];
                int j = i - 1;
                while(j >= 0 && x[j].surname.compareTo(key.surname) > 0)
                {
                    x[j+1] = x[j];
                    j--;
                }
                x[j+1] = key;
            }
        }
        else if(userChoice.equalsIgnoreCase("age"))
        {
            for(int i = 1; i < x.length; i++)
            {
                Customer key = x[i];
                int j = i - 1;
                while(j >= 0 && x[j].age > key.age)
                {
                    x[j+1] = x[j];
                    j--;
                }
                x[j+1] = key;
            }
        }
        else
        {
            System.out.println("INVALID");
            sortCustomers(x);
        }
    }
}