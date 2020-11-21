package com.capgemini.training.lab4.exercise3;

public class JournalPager extends WrittenInItem{
		private int year;

		
		
		public JournalPager() {
			super();
			// TODO Auto-generated constructor stub
		}

		public JournalPager(Integer itemId, String name, Integer copiesNo, String author,int year) {
			super(itemId, name, copiesNo, author);
			// TODO Auto-generated constructor stub	
			this.year=year;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		@Override
		public void print() {
			// TODO Auto-generated method stub
			super.print(); 
			System.out.println("Published Year: "+year);
		}
		
		
}
