class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode next;
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}

public class Driver {
    static ListNode fromArray(int... a) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        for (int x : a) {
            tail.next = new ListNode(x);
            tail = tail.next;
        }
        return dummy.next;
    }

    static void printList(ListNode head) {
        for (ListNode cur = head; cur != null; cur = cur.next) {
            System.out.print(cur.val);
            if (cur.next != null)
                System.out.print(" -> ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = fromArray(1, 2, 3, 4, 5);
        System.out.print("before: ");
        printList(head);

        ListNode rev = new Solution().reverseList(head);
        System.out.print("after:  ");
        printList(rev);
    }
}