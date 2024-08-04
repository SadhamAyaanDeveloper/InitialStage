package org.create;

public class Datahide {
	
	public static void main(String[] args) {
		
		SetterGetter s=new SetterGetter();
		
		s.setId(12334);
		s.setName("Sadham");
		s.setPhNo(96002020188L);
		
		int id = s.getId();
		System.out.println(id);
		
		String name = s.getName();
		System.out.println(name);
		
		long phNo = s.getPhNo();
		System.out.println(phNo);
	   
	}

}
