package collection_eg;

import java.util.ArrayList;
import java.util.Iterator;

public class Arratlist_eg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(22);
		al.add(33);
		al.add(44);
		System.out.println(al);
		System.out.println(al.size());
		al.add(0,11);
		System.out.println(al);
		System.out.println("fsdfse");
		System.out.println(al.indexOf(33));
		System.out.println(al.get(3));
		
		al.set(3, 55);
		System.out.println(al);
		System.out.println(al.remove(0));
		System.out.println(al);
		
		int len =al.size();
		System.out.println(len);
		for(int i=0;i<len;i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("-----------");
		for(Integer a:al)
		{
			System.out.println(a);
		}
		System.out.println("---------------------");
		
		Iterator<Integer> itr = al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
