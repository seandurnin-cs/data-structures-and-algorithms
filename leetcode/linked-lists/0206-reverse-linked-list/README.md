## Problem

**0206. Reverse Linked List**  
Given the head of a singly linked list, reverse the list and return the reversed list.  
Constraints: `0 <= n <= 5000`, `-5000 <= Node.val <= 5000`

## Approach

**Recursive**  
Reverse the rest of the list from `head.next` onward to get `newHead`. Then point `head.next.next` back to `head` and set `head.next = null` to avoid a cycle.

## Complexity

- Time: **O(n)**
- Space: **O(n)** (recursion stack)

## Edge Cases

- `head == null` (empty list) → return `null`
- `head.next == null` (single node) → return `head`