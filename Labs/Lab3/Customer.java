/*
 * Customer.java
 *
 * Defines the Customer class with fields for name, surname, and age.
 * Includes a constructor and display method for output formatting.
 */
class Customer 
{
    String name;
    String surname;
    int age;
    Customer(String name, String surname, int age) 
    {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    void display() 
    {
        System.out.println(name + " " + surname + " (" + age + ")");
    }
}