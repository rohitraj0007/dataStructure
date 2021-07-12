package Tree;

class  ListNode{
	private ListNode next;
	private int data;
	public ListNode(ListNode next, int data) {
		super();
		this.next = next;
		this.data = data;
	}
	public ListNode getNext() {
		return next;
	}
	public void setNext(ListNode next) {
		this.next = next;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
}