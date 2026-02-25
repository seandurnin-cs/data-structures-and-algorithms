public class ListNode {
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
        ListNode newHead;
        if(head == null || head.next == null) {
            return head;
        }
        newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
        

    }
}

class Driver {
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