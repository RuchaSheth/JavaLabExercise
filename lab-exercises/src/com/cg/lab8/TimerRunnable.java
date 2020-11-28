package com.cg.lab8;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TimerRunnable implements Runnable{

	@Override
	public void run() {
		
		for(int i=0;i<100;i++)
		{
			try {
				Thread.sleep(100*100);
				System.out.println("\n"+Thread.currentThread().getName()+"\nStarted At:"+
				LocalDateTime.now());
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
