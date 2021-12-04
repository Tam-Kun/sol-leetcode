package sol.leetcode;

public class Main {

    public static void main(String[] args) {
        P2_AddTwoNumbers sol = new P2_AddTwoNumbers();

        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3, null)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));
        ListNode s = sol.addTwoNumbers(l1, l2);

        for(int i=0; i<3; i++) {
            System.out.println(s.val);
            s=s.next;
        }

    }

}
