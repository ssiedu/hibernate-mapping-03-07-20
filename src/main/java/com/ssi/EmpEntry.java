package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmpEntry {

	public static void main(String[] args) {
		
		Emp e1=new Emp(111,"AAA",35000,new Laptop("L111"));
		Emp e2=new Emp(112,"BBB",25000,new Laptop("L112"));
		Emp e3=new Emp(113,"CCC",45000,new Laptop("L113"));
		Emp e4=new Emp(114,"DDD",55000,new Laptop("L114"));
		
		
		Session session=Utility.getSF().openSession();
		Transaction tr=session.beginTransaction();
		session.save(e1); session.save(e2); session.save(e3); session.save(e4);
		tr.commit();
		session.close();
		System.out.println("Emp Data Stored....");

	}

}
