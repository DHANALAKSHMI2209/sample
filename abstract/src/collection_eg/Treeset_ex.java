package collection_eg;


import java.util.TreeSet;

public class Treeset_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(78);
		ts.add(56);
		ts.add(98);
		ts.add(67);
		ts.add(56);
		
		System.out.println(ts);
		TreeSet<String> ts1=new TreeSet<>();
		ts1.add("process");
		ts1.add("task");
		ts1.add("perform");
		ts1.add("task");
		ts1.add("clear");
		System.out.println(ts1);
		ts1.remove("clear");
		System.out.println(ts1);

	}

}
