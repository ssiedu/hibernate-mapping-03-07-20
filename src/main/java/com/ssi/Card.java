package com.ssi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Card {
	@Id
	private String cno;
	private String ctype;
	private int lim;
	@ManyToOne
	private Account account;
	
	public Card() {
		super();
	}
	public Card(String cno) {
		super();
		this.cno = cno;
	}
	public Card(String cno, String ctype, int lim) {
		super();
		this.cno = cno;
		this.ctype = ctype;
		this.lim = lim;
	}
	
	public Card(String cno, String ctype, int lim, Account account) {
		super();
		this.cno = cno;
		this.ctype = ctype;
		this.lim = lim;
		this.account = account;
	}
	public String getCno() {
		return cno;
	}
	public void setCno(String cno) {
		this.cno = cno;
	}
	public String getCtype() {
		return ctype;
	}
	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	public int getLim() {
		return lim;
	}
	public void setLim(int lim) {
		this.lim = lim;
	}
	@Override
	public String toString() {
		return "Card [cno=" + cno + ", ctype=" + ctype + ", lim=" + lim + "]";
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
	
	
	
	
}