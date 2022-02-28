package trainings.bfs.week2.day1.mock.q1;

public class Question1 {

    public int q1(ListNode node, ListNode node2) {

        // Time complexity  = O(n)
        // Space complexity = O(n)

        int lenNode1 = 0;
        int lenNode2 = 0;

        //ListNode resultNode = null;
        int result = 0;

        ListNode n1 = node;
        while (n1 != null) {
            lenNode1++;
            n1 = n1.next;
        }

        ListNode n2 = node2;
        while (n2 != null) {
            lenNode2++;
            n2 = n2.next;
        }

        int lenDiff = Math.abs(lenNode1 - lenNode2);
        int len = 0;

        if (lenNode1 > lenNode2) {
            n1 = node;
            n2 = node2;
            len = lenNode1;
        } else {
            n1 = node2;
            n2 = node;
            len = lenNode2;
        }

        for (int i = 0; i < len; i++) {
            int num = 0;
            if (lenDiff > 0) {
                num = n1.val;
                n1 = n1.next;
                lenDiff--;
            } else {
                if (n1.val + n2.val > 9) {
                    num = (n1.val + n2.val) % 10;
                    result++;
                } else {
                    num = n1.val + n2.val;
                }
                n1 = n1.next;
                n2 = n2.next;
            }
            result = (result * 10) + num;
        }

        return result;
    }

    public static void main(String[] args) {

        Question1 question1 = new Question1();

        // 523
        ListNode l1a = new ListNode(5);
        ListNode l1b = new ListNode(2);
        ListNode l1c = new ListNode(3);
        ListNode l1d = new ListNode(7);
        ListNode l1e = new ListNode(5);
        ListNode l1f = new ListNode(5);
        ListNode l1g = new ListNode(9);
        l1a.next = l1b;
        l1b.next = l1c;
        l1c.next = l1d;
        l1d.next = l1e;
        l1e.next = l1f;
        l1f.next = l1g;

        // 19
        ListNode l2a = new ListNode(1);
        ListNode l2b = new ListNode(9);
        ListNode l2c = new ListNode(8);
        ListNode l2d = new ListNode(4);
        ListNode l2e = new ListNode(4);
        ListNode l2f = new ListNode(9);
        l2a.next = l2b;
        l2b.next = l2c;
        l2c.next = l2d;
        l2d.next = l2e;
        l2e.next = l2f;

        // Result --> 5436008
        System.out.println(question1.q1(l1a, l2a));
    }
}
