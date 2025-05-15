package sec01.exam01;

import java.util.*;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String>list=new ArrayList<String>();
		
		list.add("Java"); // Java
		list.add("JDBC"); // Java JDBC
		list.add("Servlet/JSP"); // Java JDBC Servlet/JSP
		list.add(2,"Database"); // Java JDBC Database Servlet/JSP
		list.add("iBATIS"); // Java JDBC Database Servlet/JSP iBATIS
		
		int size=list.size();
		System.out.println("총 객체 수 : "+size); // 5
		System.out.println();
		
		String skill=list.get(2); 
		System.out.println("2 : "+skill); // Database
		System.out.println();
		
		for(int i=0;i<list.size();i++) {
			String str=list.get(i);
			System.out.println(i+" : "+str);
		}
		System.out.println();
		
		list.remove(2); // Java JDBC Servlet/JSP iBATIS
		list.remove(2); // Java JDBC iBATIS
		list.remove("iBATIS"); // Java JDBC
		
		
		for(int i=0;i<list.size();i++) {
			String str=list.get(i);
			System.out.println(i+" : "+str);
		}
	}

}
