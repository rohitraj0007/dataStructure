package Tree;

public class SizeOfBinaryTree {
public static void main(String[] args) {
	TreeStructure ts=new TreeStructure();
	Node sampleNode=ts.getSampleNode();
	System.out.println(size(sampleNode));
}

private static int size(Node sampleNode) {
	int size=0;
	if(null==sampleNode) {
		return size;
	}
	else {
		return size=size(sampleNode.getLeft())+1+ size(sampleNode.getRight());
	}
}
}
