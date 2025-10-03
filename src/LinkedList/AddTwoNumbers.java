package LinkedList;

/**
 * This class provides a method to add two numbers represented
 * by linked lists in reverse order, where each node contains a single digit.
 */
public class AddTwoNumbers {

    /**
     * Adds two non-negative integers represented as linked lists.
     * The digits are stored in reverse order, and the result is
     * returned as a linked list in the same format.
     *
     * @param l1 the first linked list
     * @param l2 the second linked list
     * @return a linked list representing the sum
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode mover = dummy;
        int carry = 0;

        ListNode temp1 = l1;
        ListNode temp2 = l2;

        while (temp1 != null || temp2 != null || carry != 0) {
            int val1 = temp1 != null ? temp1.val : 0;
            int val2 = temp2 != null ? temp2.val : 0;

            int sum = val1 + val2 + carry;
            carry = sum / 10;
            int digit = sum % 10;

            ListNode newNode = new ListNode(digit);
            mover.next = newNode;
            mover = newNode;

            if (temp1 != null) temp1 = temp1.next;
            if (temp2 != null) temp2 = temp2.next;
        }

        return dummy.next;
    }

    /**
     * Main method to test the addTwoNumbers functionality.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        AddTwoNumbers solution = new AddTwoNumbers();

        // Example 1: (2 -> 4 -> 3) + (5 -> 6 -> 4) = 807
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode result = solution.addTwoNumbers(l1, l2);
        System.out.print("Result: ");
        while (result != null) {
            System.out.print(result.val);
            if (result.next != null) System.out.print(" -> ");
            result = result.next;
        }
    }
}