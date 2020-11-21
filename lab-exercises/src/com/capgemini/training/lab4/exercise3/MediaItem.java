package com.capgemini.training.lab4.exercise3;

public abstract class MediaItem extends Item{
	
	private int runtime;

	public MediaItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MediaItem(Integer itemId, String name, Integer copiesNo,int runtime) {
		super(itemId, name, copiesNo);
		this.runtime=runtime;
		// TODO Auto-generated constructor stub
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("Runtime: "+runtime);
	}
	
	
}