package java.com.astral;


import main.java.com.astral.ListNode;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.IvParameterSpec;
import java.security.Key;
import java.util.*;


public class Test {

    @org.junit.Test
    public void test() {
        //打印链表
        ListNode headNode1 = new ListNode(1);
        ListNode listNode1_1 = new ListNode(3);
        ListNode listNode1_2 = new ListNode(5);
        ListNode listNode1_3 = new ListNode(7);
        ListNode listNode1_4 = new ListNode(9);

        ListNode headNode2 = new ListNode(2);
        ListNode listNode2_1 = new ListNode(4);
        ListNode listNode2_2 = new ListNode(6);
        ListNode listNode2_3 = new ListNode(8);
        ListNode listNode2_4 = new ListNode(10);

        headNode1.next = listNode1_1;
        listNode1_1.next = listNode1_2;
        listNode1_2.next = listNode1_3;
        listNode1_3.next = listNode1_4;

        ListNode cur = headNode1;
        while(cur != null){
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
        System.out.println();
        //反转链表
        //reverseList(headNode,listNode1,listNode2,listNode3,listNode4);
        //判断环形链表
        //listNode4.next = listNode2;
        //isCircleList(headNode,listNode1,listNode2,listNode3,listNode4);
        //合并两个有序链表
        /*List<ListNode> nodeList1 = new ArrayList<>();
        nodeList1.add(headNode1);
        nodeList1.add(listNode1_1);
        nodeList1.add(listNode1_2);
        nodeList1.add(listNode1_3);
        nodeList1.add(listNode1_4);
        List<ListNode> nodeList2 = new ArrayList<>();
        nodeList2.add(headNode2);
        nodeList2.add(listNode2_1);
        nodeList2.add(listNode2_2);
        nodeList2.add(listNode2_3);
        nodeList2.add(listNode2_4);
        mergeListNode(nodeList1,nodeList2);*/
        /*ListNode tmpNode1 = new ListNode(1);
        ListNode tmpNode1_1 = new ListNode(2);
        ListNode tmpNode1_2 = new ListNode(4);

        ListNode tmpNode2 = new ListNode(1);
        ListNode tmpNode2_1 = new ListNode(3);
        ListNode tmpNode2_2 = new ListNode(4);
        List<ListNode> tmpNodeList1 = new ArrayList<>();
        List<ListNode> tmpNodeList2 = new ArrayList<>();
        tmpNodeList1.add(tmpNode1);
        tmpNodeList1.add(tmpNode1_1);
        tmpNodeList1.add(tmpNode1_2);
        tmpNodeList2.add(tmpNode2);
        tmpNodeList2.add(tmpNode2_1);
        tmpNodeList2.add(tmpNode2_2);
        mergeListNode(tmpNodeList1,tmpNodeList2);*/

    }

    //反转单链表
    private void reverseList(ListNode headNode,ListNode listNode1,ListNode listNode2,ListNode listNode3, ListNode listNode4){
        //链表反转
        ListNode reverseStep = headNode;
        ListNode prev = null;
        ListNode reverseTmp = null;
        while(reverseStep != null){
            reverseTmp = reverseStep;
            reverseStep = reverseStep.next;
            reverseTmp.next = prev;
            prev = reverseTmp;
        }
        ListNode curReverse = listNode4;
        while(curReverse != null){
            System.out.print(curReverse.val+" ");
            curReverse = curReverse.next;
        }
        System.out.println();
    }

    //判断环形链表
    private void isCircleList(ListNode headNode,ListNode listNode1,ListNode listNode2,ListNode listNode3, ListNode listNode4){
        Map<Integer,ListNode> map = new HashMap<>();
        //map.put(headNode.val,headNode);
        ListNode cur = headNode;
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

    //两个有序链表合并
    private void mergeListNode( List<ListNode> nodeList1, List<ListNode> nodeList2){
        List<ListNode> resultList = new ArrayList<>();
        ListNode resultNode = null;
        ListNode curNode1 = null;
        ListNode curNode2 = null;
        int curList2 = 0;
        for(int i = 0;i < nodeList1.size();){
            curNode1 = nodeList1.get(i);
            for(int j = curList2;j < nodeList2.size();){
                curNode2 = nodeList2.get(j);
                if(curNode1.val <= curNode2.val){
                    resultNode = curNode1;
                    i++;
                    curList2 = i - 1 <= 0 ? 0 : i - 1;
                    resultList.add(resultNode);
                    resultNode = resultNode.next;
                    break;
                }else{
                    resultNode = curNode2;
                    j++;
                    resultList.add(resultNode);
                    resultNode = resultNode.next;
                }
            }
        }
        for(ListNode tmp : resultList){
            System.out.println(tmp.val);
        }
    }

    @org.junit.Test
    public void tmp(){
        for(int i = 0;i < 5;i++){
            System.out.println(i);
            for(int j = 0;j < 5;j++){
                System.out.println(j);
                if(j == 3){
                    break;
                }
            }
            System.out.println("break");
        }
    }

}
