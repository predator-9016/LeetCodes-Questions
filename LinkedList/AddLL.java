// Definition for singly-linked list.
// https://leetcode.com/submissions/detail/1478562503/
package LinkedList;

class ListNode {
    int val; 
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class AddLL {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead; 
        int carry = 0; 

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry; 

            if (l1 != null) {
                sum += l1.val; 
                l1 = l1.next; 
            }

            if (l2 != null) {
                sum += l2.val; 
                l2 = l2.next; 
            }

            carry = sum / 10; 
            current.next = new ListNode(sum % 10); 
            current = current.next; 
        }

        return dummyHead.next;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        AddLL solution = new AddLL();
        ListNode result = solution.addTwoNumbers(l1, l2);
        printList(result);
    }
}
