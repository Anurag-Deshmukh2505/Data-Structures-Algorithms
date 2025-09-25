package LinkedList;

/**
 * This class provides a method to detect whether a singly linked list has a cycle.
 * <p>
 * It uses Floyd's Cycle Detection Algorithm (Tortoise and Hare) to achieve
 * O(n) time complexity and O(1) space complexity.
 */
public class LLCycle {

    /**
     * Determines if the linked list contains a cycle.
     *
     * @param head the head of the linked list
     * @return {@code true} if a cycle exists, otherwise {@code false}
     */
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // Move fast pointer twice as quickly as slow pointer
        while (fast != null && fast.next != null) {
            slow = slow.next;         // move 1 step
            fast = fast.next.next;    // move 2 steps

            if (slow == fast) {
                return true; // cycle detected
            }
        }
        return false; // no cycle
    }

    /**
     * Example usage to test the hasCycle function.
     */
    public static void main(String[] args) {
        // Construct linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));

        LLCycle sol = new LLCycle();

        // Case 1: No cycle
        System.out.println("Has cycle? " + sol.hasCycle(head)); // Output: false

        // Case 2: Create a cycle (tail connects to node 3)
        head.next.next.next.next.next = head.next.next;
        System.out.println("Has cycle? " + sol.hasCycle(head)); // Output: true
    }
}
