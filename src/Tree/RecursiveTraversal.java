package Tree;

public class RecursiveTraversal {

	
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
		if(null!=node) {
			System.out.println(node.getData());
			preOrder(node.getLeft());
			preOrder(node.getRight());
		}
		
	}
	private static void inOrder(Node node) {
		if(null!=node) {
			inOrder(node.getLeft());
			System.out.println(node.getData());
			
			inOrder(node.getRight());
		}
		
	}
	
	private static void postOrder(Node node) {
		if(null!=node) {
			postOrder(node.getLeft());			
			postOrder(node.getRight());
			System.out.println(node.getData());
		}
		
	}
}
