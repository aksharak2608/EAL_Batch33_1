package selenium4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class collections {

	public static void main (String args[])
	{
	//	map
	//	list
	//	set
		
		List<Integer> l1= new ArrayList<Integer>();
		
		l1.add(2);
		l1.add(3);
		l1.add(2);
		l1.add(2);
		l1.add(3);
		l1.add(2);
		Iterator<Integer> ir= l1.iterator();
		
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		System.out.println("set results");
		Set<Integer> s1= new HashSet<Integer>();
		s1.add(1);
		s1.add(2);
		s1.add(1);
		s1.add(1);
		s1.add(2);
		s1.add(1);
Iterator<Integer> ir1= s1.iterator();
		
		while(ir1.hasNext())
		{
			System.out.println(ir1.next());
		}
		
		System.out.println("Map results");
		Map<Integer,String> m1= new HashMap<Integer, String>();
		m1.put(100, "hi");
		
		m1.put(102, "hi");
		m1.put(103, "hi");
		
		Iterator<Integer> itrm= m1.keySet().iterator();
		while(itrm.hasNext())
		{
			int key=itrm.next();
			System.out.println(key);
			System.out.println(m1.get(key));
		}
		
	}
	
	
}
