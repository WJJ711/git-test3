class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}

public class Offer8Solution {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
       if (pNode==null){
           return null;
       }
       TreeLinkNode result=null;
       if (pNode.right!=null){
           result=pNode.right;
           while (result.left!=null){
               result=result.left;
           }
           return result;
       }else if (pNode.next!=null){
           TreeLinkNode parent=pNode.next;
           while (parent!=null&&parent.right==pNode){
               pNode=parent;
               parent=parent.next;
           }
           return parent;
       }
       return null;
    }
}