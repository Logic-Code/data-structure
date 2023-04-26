package main.java.com.astral;

public class ListNode {
    public int val;
    public ListNode next;
    //构造函数
    public ListNode(int a){
        this.val = a;
    }

    @Override
    public String toString() {
        return String.valueOf(this.val) + "," + (null == next ? "tail" : next.toString());
    }
}
