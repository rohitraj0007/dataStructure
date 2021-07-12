package Tree;

import java.util.Stack;

public class NonRecursiveTraversal {
	public static void main(String[] args) {
		TreeStructure ts=new TreeStructure();
		Node sampleNode=ts.getSampleNode();
		preOrder(sampleNode);
		System.out.println();
		inOrder(sampleNode);
		System.out.println();
		postOrder(sampleNode);
	}
	
	private static void preOrder(Node node) {
		Stack<Node> st=new Stack<Node>();
		Node root=node;
		while(root!=null) {
		System.out.println(root.getData());	
		
		if(root.getLeft()!=null) {
			st.push(root);
			root=root.getLeft();		
		}
		else if(!st.isEmpty()){
			root=st.pop().getRight();
		}else {
			break;
		}
		
		}
	}

	private static void inOrder(Node node) {
		Stack<Node> st=new Stack<Node>();
		Node root=node;
		while(root!=null) {
		//System.out.println(root.getData());	
		
		if(root.getLeft()!=null) {
			st.push(root);
			root=root.getLeft();		
		}
		else if(!st.isEmpty()){
			System.out.println(root.getData());
			root=st.pop();
			System.out.println(root.getData());
			root=root.getRight();
		}else {
			System.out.println(root.getData());
			break;
		}
		
		}
	}
	
	private static void postOrder(Node node) {
		Stack<Node> st=new Stack<Node>();
		Node root=node;
		Node prev=new Node(0,null,null);
		do {
		while(root!=null) {		
		st.push(root);
		root=root.getLeft();
		}
		 while(root==null && !st.isEmpty()){
			root=st.peek();
			if(root.getRight()==null || root.getRight()==prev) {
				System.out.println(root.getData());
				st.pop();
				prev=root;
				root=null;
			}
			else {
				root=root.getRight();
			}
		 }
		}while(!st.isEmpty());
			
	
}
}
