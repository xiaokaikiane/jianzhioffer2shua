import java.util.ArrayList;
import java.util.Stack;

public class JZ3 {//从尾到头打印链表
    public class ListNode {
       int val;
       ListNode next = null;
       ListNode(int val) {
            this.val = val;
        }
    }
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<ListNode> stack=new Stack<>();
        ListNode cur=listNode;
        while(cur!=null){
            stack.push(cur);
            cur=cur.next;
        }
        ArrayList<Integer> list=new ArrayList<>();
        while(!stack.isEmpty()){
            list.add(stack.pop().val);
        }
        return list;
    }
}
