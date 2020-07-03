package com.ssi;

import org.hibernate.Session;

public class EmpSearch {

	public static void main(String[] args) {
		
		//Searching an employee (QBI)
		Session session=Utility.getSF().openSession();
		Emp emp=session.get(Emp.class, 111);
		System.out.println(emp.getEname());
		System.out.println(emp.getSal());
		Laptop lapy=emp.getLaptop();
		System.out.println(lapy.getBrand());
		System.out.println(lapy.getPrice());
		session.close();
		
		
		

	}

}
