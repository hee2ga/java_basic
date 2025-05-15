package sec01.exam04;

import java.util.*;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String>set=new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); // 중복저장 X
		set.add("iBATIS");
		
		int size=set.size();
		System.out.println("총 객체 수 : "+size); // 4
		
		Iterator<String>iterator=set.iterator();
		while(iterator.hasNext()) {
			String element=iterator.next();
			System.out.println("\t"+element);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체 수 : "+set.size()); // 2
		
		iterator=set.iterator(); // 앞에 set 객체를 일부 제거했으므로 다시 반복자 얻기
		for(String element:set) {
			System.out.println("\t"+element);
		}
		set.clear();
		if(set.isEmpty()) {System.out.println("비어있음");}
	}

}
