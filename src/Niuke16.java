public class Niuke16 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);

        node1.next=node3;
        node3.next=node5;
        node5.next=null;
        node2.next=node4;
        node4.next=node6;
        node6.next=null;

        ListNode temp = Merge(node1,node2);
        System.out.println(temp.val);

    }

    public static ListNode Merge(ListNode list1,ListNode list2) {
        //输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。

        //太繁琐，先取一个list的next，再将此next与另一个list递归
        ListNode head = new ListNode(0);
        ListNode res = head;
        while(list1!=null || list2!=null) {
            if(list1 == null) {
                head.next = list2;
            }else if(list2 == null) {
                head.next = list1;
            }else if(list1.val > list2.val) {
                ListNode temp1 = list1.next;
                ListNode temp2 = list2.next;
                head.next = list2;
                head = head.next;
                head.next = list1;
                head = head.next;
                list1 = temp1;
                list2 = temp2;

            }else {
                ListNode temp1 = list1.next;
                ListNode temp2 = list2.next;
                head.next = list1;
                head = head.next;
                head.next = list2;
                head = head.next;
                list1 = temp1;
                list2 = temp2;
            }
        }
        return res.next;
    }
}


class ListNode{
        int val;
        ListNode next = null;

        ListNode(int val) {
        this.val = val;
        }
}