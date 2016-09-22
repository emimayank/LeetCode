
public class Tree_BT_to_BST {
	public int val;
	public Tree_BT_to_BST left;
	public Tree_BT_to_BST right;
	public Tree_BT_to_BST(int val, Tree_BT_to_BST  left,Tree_BT_to_BST  right){
		this.val=val;
		this.left=left;
		this.right=right;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree_BT_to_BST l1=new Tree_BT_to_BST(1,null,null);
		Tree_BT_to_BST l2=new Tree_BT_to_BST(2,null,null);
		Tree_BT_to_BST l3=new Tree_BT_to_BST(5,null,null);
		Tree_BT_to_BST l4=new Tree_BT_to_BST(1,null,null);
		Tree_BT_to_BST l5=new Tree_BT_to_BST(3,null,null);
		l1.left=l2;
		l1.right=l3;
		l2.left=l4;
		l2.right=l5;
		boolean b=isBST(l1,Integer.MIN_VALUE,Integer.MAX_VALUE);
		if(b==false){
			System.out.println("Not a BST");
		}
		else{
			System.out.println("It is a BST");
		}
	}
	private static boolean isBST(Tree_BT_to_BST node,int min,int max) {
		// TODO Auto-generated method stub
		if (node == null)
            return true;
 
        /* false if this node violates the min/max constraints */
        if (node.val < min || node.val > max)
            return false;
 
        /* otherwise check the subtrees recursively
        tightening the min/max constraints */
        // Allow only distinct values
        return (isBST(node.left, min, node.val-1) &&
        		isBST(node.right, node.val+1, max));
	}

}
