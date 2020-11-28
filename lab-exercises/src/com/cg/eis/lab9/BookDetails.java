package com.cg.lab9;

public class BookDetails {

	private Integer bookId=111;
	private String bookName="Java Fundamentals";
	private Double price=350.75;
	private Integer totalPages=275;
	

	public BookDetails() {
		super();
	}


	public BookDetails(Integer bookId, String bookName, Double price, Integer totalPages) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.price = price;
		this.totalPages = totalPages;
	}


	public Integer getBookId() {
		return bookId;
	}


	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public Integer getTotalPages() {
		return totalPages;
	}


	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}


	@Override
	public String toString() {
		return "BookDetails\nBook Id=" + bookId + "\nBook Name=" + bookName + 
				"\nPrice=" + price + "TotalPages="+ totalPages ;
	}
		
	
}
