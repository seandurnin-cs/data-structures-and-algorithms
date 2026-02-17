import java.util.*;

class Link {
    int data;
    Link next;

    Link(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Link first;

    public LinkedList() {
        first = null;
    }

    public void insert(int value) {
        Link newLink = new Link(value);
        if (first == null) {
            first = newLink;
            return;
        }
        Link current = first;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newLink;
    }

    public void display() {
        Link current = first;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public Link getFirst() {
        return first;
    }

    public void setFirst(Link first) {
        this.first = first;
    }
}

class ListIterator {
    private Link current;
    private Link previous;
    private Link next;
    private LinkedList ourList;

    public ListIterator(LinkedList list) {
        ourList = list;
        reset();
    }

    public void reset() {
        current = ourList.getFirst();
        previous = null;
    }

    public void nextLink() {
        previous = current;
        current = current.next;
    }

    public void reverseLink() {
        previous = null;
        current = ourList.getFirst();
        while(current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        ourList.setFirst(previous);
    }
}

public class Lab41p {
    public static void reverse(LinkedList list) {
        // You must fill in the methods to let the program runs.
        // You cannot change LinkedList and Link.
        ListIterator iter  = new ListIterator(list);
        iter.reverseLink();
    }

    public static void main(String args[]) {
        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter integers (separated by spaces, ending with 'a'");
        // Input "10 20 30 a"

        while (scanner.hasNextInt()) {
            int value = scanner.nextInt();
            list.insert(value);
        }
        scanner.close();
        list.display();
        reverse(list);
        list.display();
        // It should output 30, 20, 10
    }
}