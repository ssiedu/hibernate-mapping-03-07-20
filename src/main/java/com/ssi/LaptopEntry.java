package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class LaptopEntry {

	public static void main(String[] args) {
		
		Laptop l1=new Laptop("L111","HP",50000);
		Laptop l2=new Laptop("L112","Dell",45000);
		Laptop l3=new Laptop("L113","Lenovo",34000);
		Laptop l4=new Laptop("L114","Sony",55000);
		
		Session session=Utility.getSF().openSession();
		Transaction tr=session.beginTransaction();
		session.save(l1); session.save(l2); session.save(l3); session.save(l4);
		tr.commit();
		session.close();
		System.out.println("Laptop Data Stored....");

	}

}
