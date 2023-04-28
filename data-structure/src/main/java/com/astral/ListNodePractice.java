package main.java.com.astral;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListNodePractice {

    public static void main(String[] args) {
        //链表倒转
        reverseListNode();
        //判断环形链表
        isCircleListNode();
        //合并两个有序链表
        mergeListNode();
        //删除倒数第N个节点
        deleteLastnNode(2);
        //求链表的中间节点
        findMidNode();
    }

    //链表倒转
    private static void reverseListNode(){
        System.out.println("reverseListNode");
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
        System.out.println("init::::::::::"+head.toString());

        ListNode reverseStep = head;
        ListNode prev = null;
        ListNode reverseTmp = null;
        while(reverseStep != null){
            reverseTmp = reverseStep;
            reverseStep = reverseStep.next;
            reverseTmp.next = prev;
            prev = reverseTmp;
        }
        System.out.println(reverseTmp.toString());

    }

    //判断环形链表
    private static  void isCircleListNode(){
        System.out.println("isCircleListNode");
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
        System.out.println("init::::::::::"+head.toString());

        Map<Integer,ListNode> map = new HashMap<>();
        ListNode cur = head;
        while (cur.next != null){
            if(null != map.get(cur.val)){
                System.out.println("isCircle:"+cur.val);
                break;
            }else{
                map.put(cur.val,cur);
            }
            cur = cur.next;
        }
    }

    //合并两个有序链表
    private static void mergeListNode(){
        System.out.println("mergeListNode");
        //init
        ListNode head1 = new ListNode(1);
        ListNode node1_1 = new ListNode(3);
        ListNode node1_2 = new ListNode(5);
        ListNode node1_3 = new ListNode(7);
        ListNode node1_4 = new ListNode(9);
        head1.next = node1_1;
        node1_1.next = node1_2;
        node1_2.next = node1_3;
        node1_3.next = node1_4;
        System.out.println("init::::::::::head1:::"+head1.toString());

        ListNode head2 = new ListNode(2);
        ListNode node2_1 = new ListNode(4);
        ListNode node2_2 = new ListNode(6);
        ListNode node2_3 = new ListNode(8);
        ListNode node2_4 = new ListNode(10);
        head2.next = node2_1;
        node2_1.next = node2_2;
        node2_2.next = node2_3;
        node2_3.next = node2_4;
        System.out.println("init::::::::::head2:::"+head2.toString());


        ListNode resultNode = new ListNode(-1);
        ListNode tmp = resultNode;
        ListNode curNode1 = head1;
        ListNode curNode2 = head2;
        while (curNode1 != null && curNode2 != null){
            if(curNode1.val <= curNode2.val){
                tmp.next = curNode1;
                curNode1 = curNode1.next;
            }else{
                tmp.next = curNode2;
                curNode2 = curNode2.next;
            }
            tmp = tmp.next;
        }
        // 合并后 l1 和 l2 最多只有一个还未被合并完，我们直接将链表末尾指向未合并完的链表即可
        tmp.next = curNode1 == null ? curNode2 : curNode1;

        System.out.println(resultNode.next.toString());

        /*ListNode prehead = new ListNode(-1);

        ListNode prev = prehead;
        while (head1 != null && head2 != null) {
            if (head1.val <= head2.val) {
                prev.next = head1;
                head1 = head1.next;
            } else {
                prev.next = head2;
                head2 = head2.next;
            }
            prev = prev.next;
        }

        // 合并后 l1 和 l2 最多只有一个还未被合并完，我们直接将链表末尾指向未合并完的链表即可
        prev.next = head1 == null ? head2 : head1;

        System.out.println(prehead.next.toString());*/

    }

    //删除倒数第N个节点
    private static void deleteLastnNode(int n){
        System.out.println("deleteLastnNode");
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
        System.out.println("init::::::::::"+head.toString());
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

    //求中间节点
    private static void findMidNode(){
        System.out.println("findMidNode");
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
        System.out.println("init::::::::::"+head.toString());

        ListNode hNode = head;
        ListNode sNode = head;
        while(hNode.next != null){
            hNode = hNode.next.next;
            sNode = sNode.next;
        }
        System.out.println(sNode.toString());

    }
}
