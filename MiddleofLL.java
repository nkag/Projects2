package neha_practice;
//Calculate middle of LL. LL is 1->2->3
public class MiddleofLL extends ListNode{

	public static ListNode CalcMiddle(ListNode head)
	{
		
		if(head==null || head.getNext()==null)
		{
			return head; 
			//System.out.println("not applicable");
		}
		else{
		
			ListNode Fast_ptr=head;
			ListNode Slow_ptr=head;
			while(Fast_ptr!=null && Fast_ptr.getNext()!=null)
			{
				Slow_ptr=Slow_ptr.getNext();
				Fast_ptr=Fast_ptr.getNext().getNext();
			}
		    
			return (Slow_ptr);
		
		
		}
	}
	
	public static void main(String[] args)
	{
		ListNode head= new ListNode(1);
		ListNode Node1= new ListNode(2);
		ListNode Node2= new ListNode(3);
		head.setNext(Node1);
		Node1.setNext(Node2);
		ListNode result= CalcMiddle(head);
		System.out.println("The middle of LL is "+result.getData());
	}
}
