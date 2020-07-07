package com.ssi;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Account {
	@Id
	private int ano;
	private String name;

	@OneToMany(mappedBy="account")
	private List<Card> cards;
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Card> getCards() {
		return cards;
	}
	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	public Account(int ano, String name, List<Card> cards) {
		super();
		this.ano = ano;
		this.name = name;
		this.cards = cards;
	}
	public Account() {
		super();
	}
	public Account(int ano) {
		super();
		this.ano = ano;
	}
	
}
