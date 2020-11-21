package com.capgemini.training.lab4.exercise3;

abstract public class Item {
	private Integer itemId;
	private String name;
	private Integer copiesNo;

	
	public Item() {
		super();
	}


	public Item(Integer itemId, String name, Integer copiesNo) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.copiesNo = copiesNo;
	}


	public Integer getItemId() {
		return itemId;
	}


	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getCopiesNo() {
		return copiesNo;
	}


	public void setCopiesNo(Integer copiesNo) {
		this.copiesNo = copiesNo;
	}


	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", name=" + name + ", copiesNo=" + copiesNo + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		
		Item otherItem = (Item) obj;
		return itemId == otherItem.itemId && 
			   name == otherItem.name && 
			   copiesNo == otherItem.copiesNo;
	}


	public void print() {
		System.out.println("ID: " + itemId);
		System.out.println("Title: " + name);
		System.out.println("Number of copies: " + copiesNo);
	}

	public void checkIn() {
		copiesNo = copiesNo + 1;
	}
	
	public void checkOut() {
		copiesNo = copiesNo - 1;
	}

	public void addItem(int idNum, String str, int n) {
		setItemId(idNum);
		setName(str);
		setCopiesNo(n);
	}

	
	
}
