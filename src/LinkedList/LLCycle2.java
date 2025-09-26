package LinkedList;

/**
 * This class provides a method to detect the node where a cycle begins
 * in a singly linked list.
 * <p>
 * It uses Floyd's Cycle Detection Algorithm (Tortoise and Hare). After
 * detecting a cycle, one pointer starts from the head and the other from
 * the meeting point. They move one step at a time, and their meeting
 * point is the cycle start.
 */
public class LLCycle2 {

    /**
     * Detects the node where the cycle begins in a linked list.
     *
     * @param head the head of the linked list
     * @return the node where the cycle starts, or {@code null} if no cycle exists
     */
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // Phase 1: Detect if a cycle exists
        while (fast != null && fast.next != null) {
            slow = slow.next;         // move 1 step
            fast = fast.next.next;    // move 2 steps

            if (slow == fast) {
                // Phase 2: Find the cycle start
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow; // cycle entry point
            }
        }
        return null; // no cycle
    }

    /**
     * Example usage to test the detectCycle function.
     */
    public static void main(String[] args) {
        // Construct linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));

        LLCycle2 sol = new LLCycle2();

        // Case 1: No cycle
        ListNode result1 = sol.detectCycle(head);
        System.out.println("Cycle starts at: " + (result1 != null ? result1.val : "null")); // Output: null

        // Case 2: Create a cycle (tail connects to node 3)
        head.next.next.next.next.next = head.next.next;
        ListNode result2 = sol.detectCycle(head);
        System.out.println("Cycle starts at: " + (result2 != null ? result2.val : "null")); // Output: 3
    }
}
