
public class JZ14 {
    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null){
            return null;
        }
        ListNode cur=head;
        int len=0;
        while(cur!=null){
            len++;
            cur=cur.next;
        }
        if(k>len){
            return null;
        }
        ListNode p=head;
        for(int i=0;i<len-k;i++){
            p=p.next;
        }
        return p;
    }
}
