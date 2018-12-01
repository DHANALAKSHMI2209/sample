package collection_eg;

import java.util.HashSet;


public class Hashset_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<Integer> hs = new HashSet<>();
hs.add(45);
hs.add(12);
hs.add(34);
hs.add(23);
hs.add(23);
hs.add(45);
hs.add(null);
System.out.println(hs);
hs.add(null);
System.out.println(hs);
hs.remove(null);
System.out.println(hs);
HashSet<String> hs1 = new HashSet<>();
hs1.add("jhghjghj");
hs1.add("jhghjghj");
hs1.add("gfhghjgjghkj");
System.out.println(hs1);
int len=hs.size();
for(int i=0;i<len;i++)
{
	System.out.println(hs.size());
	}

	}

}
