package code;

class ListNode{
    ListNode next;
    int value;
    ListNode(int value){
        this.value = value;
    }
}
public class CycleDetection {
    public static boolean hasCycle(ListNode node) {

        if(node == null) return false;

        ListNode slow = node, fast = node;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }


    public static void main(String[] args) {
        // Input Like This {1->2->3->4->5->2}

        ListNode node  = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);
        node.next.next.next.next.next = node.next;
        System.out.println("hasCycle -- "+hasCycle(node));
    }
}
