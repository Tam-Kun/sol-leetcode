package sol.leetcode;

public class P2_AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sol = new ListNode(0);
        ListNode head = sol;

        int a,b,sum, temp = 0;
        a = l1.val;
        b = l2.val;
        while(l1 !=null || l2 !=null) {
            sum = a + b + temp;
            if(sum > 9) {
                temp = 1;
                sum = sum-10;
            } else {
                temp = 0;
            }

            sol.val = sum;


            if(l1!=null) {
                l1 = l1.next;
            }
            if(l1!=null) {
                a = l1.val;
            } else {
                a = 0;
            }

            if(l2!=null) {
                l2 = l2.next;
            }
            if(l2!=null) {
                b = l2.val;
            } else {
                b = 0;
            }

            if(l1 != null || l2 != null) {
                sol.next = new ListNode();
                sol = sol.next;
            } else if(temp==1) {
                sol.next = new ListNode(1);
            }
        }

        return head;
    }
}


