package LinkedList;

/**
 * This class provides a method to find the middle node of a singly linked list.
 * <p>
 * It uses the fast and slow pointer technique to achieve O(n) time
 * and O(1) space complexity.
 */
public class MiddleOfLL {

    /**
     * Finds the middle node of a singly linked list.
     * If there are two middle nodes, returns the second one.
     *
     * @param head the head of the linked list
     * @return the middle node of the list
     */

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // Move fast pointer twice as quickly as slow pointer
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow; // slow will be at the middle
    }

    /**
     * Example usage to test the middleNode function.
     */
    public static void main(String[] args) {
        // Construct linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));

        MiddleOfLL sol = new MiddleOfLL();
        ListNode middle = sol.middleNode(head);

        System.out.println("Middle node value: " + middle.val); // Output: 3
    }
}

