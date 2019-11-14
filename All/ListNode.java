package All;

/**
 * 考点：链表Linked-List
 * 需要考虑两个入参均为空的情况
 * 线性表是最常用的存储结构，线性表的每个单元成为元素，元素拥有一个数据及一个地址
 * 两种物理存储方式：顺序存储方式和链式存储方式
 */

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
