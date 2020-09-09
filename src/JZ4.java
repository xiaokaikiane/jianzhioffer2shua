import java.util.Arrays;

public class JZ4 {//重建二叉树
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length==0){
            return null;
        }
        int rootval=pre[0];
        TreeNode root=new TreeNode(rootval);
        if(pre.length==1){
            return root;
        }
        int i=0;
        for (;i<in.length;i++){
            if(in[i]==rootval){
                break;
            }
        }
        //Arrays.copyOfRange()为左闭右开区间
        root.left=reConstructBinaryTree(
                Arrays.copyOfRange(pre,1,i+1),
                Arrays.copyOfRange(in,0,i));
        root.right=reConstructBinaryTree(
                Arrays.copyOfRange(pre,i+1,pre.length),
                Arrays.copyOfRange(in,i+1,in.length));
        return root;
    }
}
