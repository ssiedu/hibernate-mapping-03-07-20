package com.ssi;

import java.util.List;

import org.hibernate.Session;

public class CardSearch {
	public static void main(String[] args) {
		Session session=Utility.getSF().openSession();
		Card card=session.get(Card.class, "c111");
		System.out.println(card.getCno());
		System.out.println(card.getCtype());
		System.out.println(card.getLim());
		
		session.close();
	}
}
