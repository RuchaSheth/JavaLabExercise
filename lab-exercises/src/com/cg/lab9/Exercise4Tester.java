package com.cg.lab9;

import java.util.function.Supplier;

public class Exercise4Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Supplier<BookDetails> bookDetails = BookDetails::new;
		/*
		 * System.out.println(bookDetails.get().getBookId());
		 * System.out.println(bookDetails.get().getBookName());
		 * System.out.println(bookDetails.get().getPrice());
		 * System.out.println(bookDetails.get().getTotalPages());
		 */	
		System.out.println(bookDetails.get());
	}

}
