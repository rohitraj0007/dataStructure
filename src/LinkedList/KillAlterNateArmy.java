package LinkedList;




public class KillAlterNateArmy {
public static void main(String[] args) {
	LinkedList li=new LinkedList();
	
	for(int i=1;i<=6;i++) {
		li.insert(li, i);
	}
	li=li.convertToCircular(li);
	calculateLastSurvivor(li);
}
	


private static void calculateLastSurvivor(LinkedList li) {
	LinkedList.Node node=li.head;//1
	LinkedList.Node next;
	LinkedList.Node nextToNext;
	LinkedList.Node finalNode;
	while(null!=node) {
		//System.out.println(node.data);
		
		next=node.next;//2 which will be deleted by 1
		if(null!=next) {
			finalNode=next.next;//3 the sequence will be 1,3,4...
			node.next=finalNode;//the sequence will be 1,2,4
			node=finalNode;
		if(next==node){
			break;
		}
		
			}
		
		
		}
	System.out.println(node.data);
	
		
		
}


}
