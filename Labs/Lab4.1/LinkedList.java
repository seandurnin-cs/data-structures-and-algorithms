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

    public void getCopy() {
        
    }
}