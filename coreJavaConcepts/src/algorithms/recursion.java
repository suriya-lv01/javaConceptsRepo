package algorithms;

import java.util.ArrayList;
import java.util.LinkedList;

public class recursion {

	public int sum(ArrayList<Integer> al) {
		//if size is 1 return same element
		//if size > 1 , return index[0]+sum(1,lastindex)
		
		if(al.size()==1) {
			return al.get(0)
		}
		return al.subList(fromIndex, toIndex)
	}

	public static void main(String args[]) {
		ArrayList<Integer> al	=	new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		System.out.println(al);
	}

}
