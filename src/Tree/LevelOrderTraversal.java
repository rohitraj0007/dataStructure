package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
	public static void main(String[] args) {
		TreeStructure ts=new TreeStructure();
		Node sampleNode=ts.getSampleNode();
		levelOrder(sampleNode);
		
	}

	private static void levelOrder(Node sampleNode) {
		Queue<Node> q
        = new LinkedList<>();
		Node node=null;
	if(null!=sampleNode) {
		q.add(sampleNode);
	}
	int height=1;
	while(!q.isEmpty()) {
		boolean leftRight=false;
		
		node=q.poll();
		System.out.println(node.getData());
		if(null!=node.getLeft()) {
			q.add(node.getLeft());
			height++;
			leftRight=true;
		}
		if(null!=node.getRight()) {
			q.add(node.getRight());
			if(!leftRight) {
				height++;
			}
		}
	}
	System.out.println("height of tree: "+height);
		
	}
}
