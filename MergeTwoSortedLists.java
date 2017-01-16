package neha_practice;
/*
 * https://discuss.leetcode.com/topic/5513/my-recursive-way-to-solve-this-problem-java-easy-understanding
 */
public class MergeTwoSortedLists extends ListNode{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode n1=new ListNode(5);
		ListNode n2=new ListNode(10);
		ListNode n3=new ListNode(15);
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(null);
	
		ListNode m1=new ListNode(2);
		ListNode m2=new ListNode(3);
		ListNode m3=new ListNode(20);
		m1.setNext(m2);
		m2.setNext(m3);
		m3.setNext(null);

		ListNode resultMergedListHead=MergeSortedLists(n1,m1);
		//Now printing outthe whole merged list. 
		while(resultMergedListHead!=null)
		{
		System.out.println(resultMergedListHead.getData());
		resultMergedListHead=resultMergedListHead.getNext();
		}
		//System.out.println(resultMergedListHead.getNext().getData());
	//	System.out.println(resultMergedListHead.getNext().getNext().getData());
		
	}
	
	public static ListNode MergeSortedLists(ListNode p, ListNode q)
	{
		if(p==null)
			return q;
		if(q==null)
			return p;
		
		ListNode mergedHead;
		if(p.getData()<q.getData())
		{
			mergedHead=p;
			mergedHead.setNext(MergeSortedLists(p.getNext(), q));
			//this line above is like mergedHead.next=MergeSortedLists(p.getNext(), q);
			//mergedHead.getNext()=MergeSortedLists(p.getNext(), q);
		}
		else
			//ie(p.getData()>q.getData())
		{
			mergedHead=q;
			mergedHead.setNext(MergeSortedLists(p, q.getNext()));
		//	mergedHead.next=MergeSortedLists(p, q.getNext());
		}
		
		return mergedHead;
	}

}
