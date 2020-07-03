package com.ssi;

import org.hibernate.Session;

public class LaptopSearch {

	public static void main(String[] args) {
		Session session=Utility.getSF().openSession();
		Laptop laptop=session.get(Laptop.class, "L111");
		System.out.println(laptop.getLcode());
		System.out.println(laptop.getBrand());
		System.out.println(laptop.getPrice());
		Emp e=laptop.getEmp();
		System.out.println(e.getEno());
		System.out.println(e.getEname());
		System.out.println(e.getSal());
		session.close();
	}

}
