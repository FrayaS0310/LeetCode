package All;

import java.util.*;


public class ListNode {
    int val;
    ListNode next;   // 下一个链表对象
    ListNode(int x) { val = x; }  //赋值链表的值
}

class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);

        ListNode cur = dummy;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int d1 = l1 == null ? 0 : l1.val;
            int d2 = l2 == null ? 0 : l2.val;
            int sum = d1 + d2 + carry;
            carry = sum >= 10 ? 1 : 0;
            cur.next = new ListNode(sum % 10);
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
            if (carry == 1) {
                cur.next = new ListNode(carry);
            }
        }
        return dummy.next;
    }
}
