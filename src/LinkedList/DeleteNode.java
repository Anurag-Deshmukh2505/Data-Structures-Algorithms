package LinkedList;

/**
 * This class provides a method to delete a node in a singly linked list.
 * <p>
 * The node to be deleted is guaranteed not to be the tail node.
 * The algorithm works by copying the value of the next node into the
 * current node and bypassing the next node.
 */
public class DeleteNode {

    /**
     * Deletes the given node (except the tail) from the linked list.
     *
     * @param node the node to delete (not the tail node)
     */
    public void deleteNode(ListNode node) {
        if (node == null || node.next == null) {
            throw new IllegalArgumentException("Node to be deleted cannot be null or the tail node.");
        }
        node.val = node.next.val;
        node.next = node.next.next;
    }

    /**
     * Example usage to test the deleteNode function.
     */
    public static void main(String[] args) {
        // Construct linked list: 1 -> 2 -> 3 -> 4
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4))));

        System.out.print("Original list: ");
        printList(head);

        // Delete node with value 3
        DeleteNode sol = new DeleteNode();
        sol.deleteNode(head.next.next);

        System.out.print("After deleting node 3: ");
        printList(head);
    }

    /**
     * Utility function to print the linked list.
     */
    private static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + (curr.next != null ? " -> " : ""));
            curr = curr.next;
        }
        System.out.println();
    }
}
