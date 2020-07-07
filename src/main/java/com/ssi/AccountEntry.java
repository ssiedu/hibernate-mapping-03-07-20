package com.ssi;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class AccountEntry {
public static void main(String[] args) {
		
	
		
		
		Account ac1=new Account(); ac1.setAno(111); ac1.setName("ABC"); 
		Account ac2=new Account(); ac2.setAno(112); ac2.setName("XYZ"); 
	
		Session session=Utility.getSF().openSession();
		Transaction tr=session.beginTransaction();
		session.save(ac1); session.save(ac2); 
		tr.commit();
		System.out.println("DATA Stored");
		
		
	}
}
