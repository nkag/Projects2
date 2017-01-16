package neha_practice;
import java.util.*;

public class TwoSum {

	public static HashMap<Integer, Integer> elements = new HashMap<Integer, Integer>();


		public static void add(int number) {
		if (elements.containsKey(number)) {
			elements.put(number, elements.get(number) + 1);
			System.out.println("number inserted & duplicate found so value incremented");
		} else {
			elements.put(number, 1);
			System.out.println("number inserted in else part");
		}
	}
 
	public static boolean find(int value) {
		for (Integer i : elements.keySet()) {
			int target = value - i;
			if (elements.containsKey(target)) {
				if (i == target && elements.get(target) < 2) {
					continue;
				}
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args){

		 HashMap<Integer, Integer> elements = new HashMap<Integer, Integer>();
		System.out.println("hello");
		add(6);
		add(3);
		add(12);
		add(1);
		add(12);
		boolean result=find(9);
		System.out.println("run");
		System.out.println(result);
	}

}