package com.ssi;

import java.util.List;

import org.hibernate.Session;

public class AccountSearch {

	public static void main(String[] args) {
		Session session=Utility.getSF().openSession();
		Account account=session.get(Account.class, 112);
		System.out.println(account.getAno());
		System.out.println(account.getName());
		List<Card> cards=account.getCards();
		for(Card card:cards) {
			System.out.println(card.getCno()+","+card.getCtype());
		}
		session.close();
	}

}
