package com.capgemini.training.lab4.exercise3;

public class Exercise3Tester {

	public static void main(String[] args) {
		
		Book book = new Book(111, "Java Fundamentals", 50, "sam");
		book.print();
		System.out.println("----After CheckIn----");
		book.checkIn();
		book.print();
		
		System.out.println("***********************");
		JournalPager jp = new JournalPager(222,"journal 1",25,"abc",1990);
		jp.print();
		jp.checkOut();
		System.out.println("----After CheckOut----");
		jp.print();
		
		System.out.println("***********************");
		CD cd= new CD(333, "CD 1", 19, 6, "Johny", "Drama");
		cd.print();
		cd.addItem(333, "CD 1", 10);
		System.out.println("-----New items added-----");
		cd.print();
		
		System.out.println("***********************");
		Video vd = new Video(444, "video 1", 55, 10, "John", "Comedy", 2019);
		vd.print();
	
		
	}

}
