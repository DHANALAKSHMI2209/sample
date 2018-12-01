package collection_eg;

import java.util.ArrayList;

public class Arraystring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> str = new ArrayList<>();
str.add("pink");
str.add("white");
str.add("black");
str.add("red");
str.add("blue");
str.add("brown");
System.out.println(str);
System.out.println(str.size());
str.add(1, "purple");
str.add("brown");
System.out.println(str);
	System.out.println(str.indexOf("purple"));
	System.out.println(str.get(5));
	str.set(2, "orange");
	System.out.println(str);
	str.remove(1);
	System.out.println(str);
	for(String a:str)
	{
		
		System.out.println(a);
		}

	}
	
	

	
}
