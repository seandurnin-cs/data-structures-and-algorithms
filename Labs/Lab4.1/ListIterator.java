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