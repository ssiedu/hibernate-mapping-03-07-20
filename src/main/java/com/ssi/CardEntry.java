package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

class CardEntry {

	public static void main(String[] args) {
		
		Card c1=new Card("C111","Gold",50000);
		Card c2=new Card("C112","Silver",30000);
		Card c3=new Card("C113","Platinum",80000);
		Card c4=new Card("C114","Gold",60000);
		Card c5=new Card("C115","Silver",45000);

		Session session=Utility.getSF().openSession();
		Transaction tr=session.beginTransaction();
		session.save(c1); session.save(c2); session.save(c3);
		session.save(c4); session.save(c5);
		tr.commit();
		System.out.println("DATA Stored");
		
		
	}

}
