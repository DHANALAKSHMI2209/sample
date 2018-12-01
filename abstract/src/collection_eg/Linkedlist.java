package collection_eg;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> ll= new LinkedList<>();
ll.add("bhanu");
ll.add("dhana");
ll.add("nive");
ll.add("nimi");
ll.add("sandy");
System.out.println(ll);
ll.addLast("priya");
ll.addLast("priya");
System.out.println(ll);
ll.set(3, "rgg");
System.out.println(ll);
   ll.get(4);
	System.out.println(ll);
	ll.set(2, "yamu");
ll.get(2);
	System.out.println(ll);
	ll.remove("rgg");
	System.out.println(ll);
	System.out.println(ll.removeLast());
	System.out.println(ll);
	}
	

}
