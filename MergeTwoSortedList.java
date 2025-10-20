class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class MergeTwoSortedList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }

        curr.next = (l1 != null) ? l1 : l2;
        return dummy.next;
    }

    public static ListNode createList(int[] nums) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        for (int num : nums) {
            current.next = new ListNode(num);
            current = current.next;
        }
        return dummy.next;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null)
                System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MergeTwoSortedList merger = new MergeTwoSortedList();

        ListNode l1 = createList(new int[] { 1, 2, 4 });
        ListNode l2 = createList(new int[] { 1, 3, 5 });

        ListNode merged = merger.mergeTwoLists(l1, l2);
        printList(merged); // Output: 1 -> 1 -> 2 -> 3 -> 4 -> 5
    }
}
