package DSA.linkedlist;

public class LinkedList {
    ListNode head;

    public void append (int data) {
        ListNode newNode = new ListNode(data);

        if (head == null) {
            head = newNode;
            return;
        }

        ListNode current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public void print () {
        ListNode current = head;

        while (current != null) {
            System.out.println(current.getData() + " --> " + current.getNext());
            current = current.getNext();
        }
        System.out.println();
    }
}
