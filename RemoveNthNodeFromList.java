package neha_practice;

public class RemoveNthNodeFromList extends ListNode {
//incorrect. re-do n check
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1=new ListNode(10);
		ListNode n2=new ListNode(20);
		ListNode n3=new ListNode(30);
		ListNode n4=new ListNode(40);
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		n4.setNext(null);
		int n=2;
	ListNode result=	RemovingNthNode(n1,n);
System.out.println(result.getData());
System.out.println(result.getNext().getData());
System.out.println(result.getNext().getNext().getData());

System.out.println(result.getNext().getNext().getNext().getData());
	}
	
	public static ListNode RemovingNthNode(ListNode node1, int n){
		
		if(node1==null || n==0)
			return null;
		ListNode slow=node1;
		ListNode fast=node1;
		
		for(int i=0; i<n; i++)
		{
		   fast=fast.getNext();	
		}
		
		  if(fast == null){
		        node1 = node1.getNext();
		        return node1;
		    }
		 
		while(fast!=null)
		{
			fast=fast.getNext();
			slow=slow.getNext();
			
		}
		
	//	ListNode x=slow.getNext();
		slow.setNext(slow.getNext().getNext());
		
		return node1; 
		}

}
