package main.java.com.astral;

public class ListNodePractice {

    public static void main(String[] args) {
        //删除倒数第N个节点
        deleteLastnNode(2);
    }

    //删除倒数第N个节点
    private static void deleteLastnNode(int n){
        //init
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        System.out.println(head.toString());
        int size = 1;
        ListNode tmp = head;
        while(tmp.next != null){
            size++;
            tmp = tmp.next;
        }
        ListNode curNode = head;
        for(int i = 1;i < size - n;i++){
            //System.out.println(curNode.toString());
            curNode = curNode.next;
            //System.out.println(curNode.toString());
        }
        //System.out.println(curNode.toString());
        curNode.next = curNode.next.next;
        //System.out.println(curNode.toString());
        System.out.println(head.toString());
    }
}
