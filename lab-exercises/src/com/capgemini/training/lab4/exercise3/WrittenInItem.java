package com.capgemini.training.lab4.exercise3;

public abstract class WrittenInItem extends Item{

	private String author;

	public WrittenInItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WrittenInItem(Integer itemId, String name, Integer copiesNo,String author) {
		super(itemId, name, copiesNo);
		this.author=author;
		// TODO Auto-generated constructor stub
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("Author: " + author);

	}
	
	
}
