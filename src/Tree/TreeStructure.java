package Tree;

public class TreeStructure {
	/*
	 * sample tree to code
	 * 
	 * preorder = 1 2 4 5 3 6 7 inorder = 4 2 5 1 6 3 7 postorder = 4 5 2 6 7 3 1
	 */
	 Node sampleNode = new Node(0, null, null);

	public  Node getSampleNode() {
		Node fourthNode = new Node(4, null, null);
		Node fifthNode = new Node(5, null, null);
		Node sixthNode = new Node(6, null, null);
		Node seventhNode = new Node(7, null, null);

		Node secondNode = new Node(2, fourthNode, fifthNode);
		Node thirdNode = new Node(3, sixthNode, seventhNode);

		Node firstNode = new Node(1, secondNode, thirdNode);

		sampleNode = firstNode;
		return sampleNode;

	}
}
