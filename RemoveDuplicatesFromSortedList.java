package neha_practice;

public class RemoveDuplicatesFromSortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode n1=new ListNode(10);
		ListNode n2=new ListNode(10);
		ListNode n3=new ListNode(20);
		ListNode n4=new ListNode(25);
		ListNode n5=new ListNode(30);
		
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		n4.setNext(n5);
		n5.setNext(null);
		
		ListNode result= RemoveDuplicates(n1);
		System.out.println(result.getData());
	}

	public static ListNode RemoveDuplicates(ListNode head)
	{
	     if(head==null)
	       return null;
	     ListNode node1=head;
	     while(node1.getNext()!=null)
	{
	           if(node1.getData()==node1.getNext().getData()) //ie if there are duplicates
	          {
	                
	                node1.setNext(node1.getNext().getNext());
	            
	           }

	       else{
	                node1=node1.getNext();
	               }
	}

	return head;

	}
	
	
}
