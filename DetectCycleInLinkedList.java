class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class DetectCycleInLinkedList {

    public boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(3);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(0);
        ListNode d = new ListNode(-4);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = b; // Cycle here

        DetectCycleInLinkedList detector = new DetectCycleInLinkedList();
        System.out.println("Has cycle: " + detector.hasCycle(a)); // Should print true
    }
}
