package pathsum;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null) return false;
        if (root.left == null && root.right == null) return root.val == sum;
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        root.val = sum - root.val; 
        while (!queue.isEmpty()) {
        	TreeNode poll = queue.poll();
        	
        	if (poll.left != null) {
        	    
        	    int leftval = poll.val - poll.left.val;  
        	    
        	    if (leftval == 0 && poll.left.left == null && poll.left.right == null) {
        		    return true;
        	    }
        	    
        		poll.left.val = leftval;
        		queue.add(poll.left);
        	}
        	
        	if (poll.right != null) {
            	int rightval = poll.val - poll.right.val;
            	
            	if (rightval == 0 && poll.right.left == null && poll.right.right == null) {
            		return true;
            	}
            	
            	poll.right.val = rightval;
            	queue.add(poll.right);
        	
        	}
        	
        }
        return false;
    }
	
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.left.left = new TreeNode(4);
		root.left.left.left.left = new TreeNode(5);
		System.out.println(new Solution().hasPathSum(root, 6));
	}

}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}
