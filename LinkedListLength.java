package neha_practice;

public class LinkedListLength extends ListNode{

	public static void main(String[] args){
		
		ListNode head=new ListNode(9); //Here, u r creating 3 new LinkedListNodes with data in them as 9, 2 & 6. 
		ListNode Node1=new ListNode(2);
		ListNode Node2=new ListNode(6);
		ListNode newNode=new ListNode(7);
		ListNode Node3=new ListNode(55);
		//we want to insert 7 between 2&6. so 9,2,7,6,55.
	//	head.setNext(Node1); //Now, you are setting pointers for the next subsequent nodes from head. Head points to Node1. 
		//Node1.setNext(Node2); //Node1 points to Node2. 
		//Node2.setNext(Node3); 
	//	Node3.setNext(null);
		
		head.setNext(Node1);
		Node1.setNext(newNode);
		newNode.setNext(Node2);
		Node2.setNext(Node3);
		
		System.out.println("Length is"+ length(head));		
	}
	public static int length(ListNode headNode){
		
		int length=0;
		ListNode currentNode=headNode;
		while(currentNode!=null){
			System.out.println(currentNode.getData());
			length++;
			currentNode=currentNode.getNext();
		}
		return length;
		
	}
	
}
