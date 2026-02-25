Problem

0206. Reverse Linked List
Given the head of a singly linked list, reverse the list and return the reversed list.
Constraints: 0 <= n <= 5000, -5000 <= Node.val <= 5000

Approach

Iterative
Maintain three pointers: prev, curr, and next.
While traversing the list, store curr.next in next, redirect curr.next to prev (reversing the link), then advance prev and curr forward. When curr becomes null, prev is the new head of the reversed list.

Complexity

Time: O(n)

Space: O(1)

Edge Cases

head == null (empty list) → return null

head.next == null (single node) → return head