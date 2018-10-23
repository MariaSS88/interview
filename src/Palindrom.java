public class Palindrom {
    public static boolean isListPalindrome(ListNode head) {
        int size = 1;
        ListNode node = head;

        while(node.next!=null){
            size++;
            node = node.next;
        }
        System.out.println("Size= "+size);
        int mid = 0;
        node = head;
        ListNode prev = null;
        ListNode tmp;

        while (mid < size/2){
            System.out.println("node = " + node.val);
            tmp = node.next;
            node.next = prev;
            prev = node;
            node = tmp;
            mid++;
        }

        System.out.println("mid= "+mid+ "  mid node = "+prev.val );
        if (size%2 != 0){
            node = node.next;
        }

        while(node!=null && prev!=null){
            System.out.println(prev.val + "  "+ node.val);
            if(node.val != prev.val){
                return false;
            }

            node = node.next;
            prev = prev.next;
        }

        return true;
    }

    public static void main (String[] args){
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        head.next = node1;
        ListNode node2 = new ListNode(3);
        node1.next = node2;
        ListNode node3 = new ListNode(3);
        node2.next = node3;
        ListNode node4 = new ListNode(2);
        node3.next = node4;
        ListNode node5 = new ListNode(1);
        node4.next = node5;
        System.out.println(isListPalindrome(head));
    }
}
