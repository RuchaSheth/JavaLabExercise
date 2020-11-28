package com.cg.lab8;

public class Exercise2{

	public static void main(String[] args) {

		Runnable runnable = new TimerRunnable();
		
		Thread t1 = new Thread(runnable,"Worker1");
		
		t1.start();
	}

}

 