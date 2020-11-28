package com.capgemini.lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Students:");
        int num = sc.nextInt();
        int regNum,marks;
        
        HashMap<Integer, Integer> studentData = new HashMap<Integer,Integer>();
        System.out.println("Enter Registration Number and Marks of Students:");
        
        for(int i=0;i<num;i++)
        {
        	 regNum =sc.nextInt();
        	 marks = sc.nextInt();
        	studentData.put(regNum, marks);
        }
       
        Map<Integer,String> resultMap = getStudents(studentData);
        
        
       if(resultMap.isEmpty())
       {
    	      System.out.println("Students are not eligible for the Medal ! ");
       }
       else {
    	   System.out.println("**** Students Eligible For the Medals ****");
        for(Map.Entry<Integer,String> m : resultMap.entrySet())
        	{
        	System.out.println(m.getKey()+"  "+m.getValue());
        	}
       }
       
       sc.close();
	}

	/**
	 * @param map1
	 * @return students eligible for medal
	 */
	public static HashMap<Integer,String> getStudents(HashMap<Integer,Integer>map1){
	  HashMap<Integer,String> result = new HashMap<>();
	  
	  int marks,regNum;
	  String medal="NONE";
	    for(Map.Entry<Integer, Integer> r : map1.entrySet())
	    {
	    	marks=r.getValue();
	    	regNum=r.getKey();
	    	if(marks>=90)
	    	{
	    		medal = "Gold";
	    	}
	    	else if((marks>=80)&&(marks<90))
	    	{
	    		medal = "Silver";
	    	}
	    	else if((marks>=70)&&(marks<80))
	    	{
	    		medal = "Bronze";
	    	}
	    		
	    	if((medal.equals("Gold"))||(medal.equals("Silver"))||(medal.equals("Bronze")))
	    	{
	    			result.put(regNum, medal);
	    	}
	    	
	    }
		
		return result;	
	}
	
}
