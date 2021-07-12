package Tree;

import java.util.LinkedList;
import java.util.Queue;

/*
 * by recursion
 */
public class MaximumElements {
public static void main(String[] args) {
	TreeStructure ts=new TreeStructure();
	Node sampleNode=ts.getSampleNode();
	System.out.println(findMaxWithRecursion(sampleNode));
	System.out.println(findMaxWithoutRecursion(sampleNode));
}

private static int findMaxWithRecursion(Node sampleNode) {
	if(null!=sampleNode) {
		int root_val=sampleNode.getData();
		int max_left=findMaxWithRecursion(sampleNode.getLeft());
		int max_right=findMaxWithRecursion(sampleNode.getRight());
		int max=0;
		if(max_left>max_right) {
			max=max_left;
		}
		else {
			max=max_right;
		}
		if(root_val>max) {
			return root_val;
		}
		else {
			return max;
		}
	}
	return 0;
	
}
private static int findMaxWithoutRecursion(Node sampleNode) {
	Queue<Node> q=new LinkedList<>();
	int max=0;
	if(null!=sampleNode) {
		q.add(sampleNode);
	}
	while(!q.isEmpty()){
		Node node=q.poll();
		if(node.getData()>max) {
			max=node.getData();
		}
		if(null!=node.getLeft()) {
			q.add(node.getLeft());
		}
		if(null!=node.getRight()) {
			q.add(node.getRight());
		}
	}
	return max;
}
}


