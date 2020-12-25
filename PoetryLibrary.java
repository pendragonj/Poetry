package com.PoetryGen.main;

import java.util.Date;


public class PoetryLibrary {
	
	private Poetry[] poems; // all poems in library
	
//	private Poetry[] melancholia = {};
//	private Poetry[] antiCapitalistLoveNotes = {};
//	private Poetry[] fernweh = {};
//	private Poetry[] agnosthesia = {};
//	private Poetry[] exulansis = {};
//	private Poetry[] jaienviedelesrevior = {};
	
	public byte[] toBinary(Poetry poem) {
		
	
		
   return poem.getText().getBytes();
		
		
  }
 	

	public Poetry[] searchbyMood(String mood) {
		
		Poetry[] poemMood = new Poetry[0];
		
		
		for (int i = 0; i < poems.length; i++) {
			
			if (poems[i].getMood().equals(mood)) {
					
					Poetry[] temp = new Poetry [poemMood.length + 1];
					
					for(int j = 0; j < poemMood.length; j++) {
						
						temp[j] = poemMood[j];
						
					}
					
					temp[temp.length - 1] = poems[i];
					
					poemMood = temp;
					
				}																				
				
			}
			
			
			return poemMood;
		}
	
	public Poetry[] searchbyAuthor(String author) {
		
		Poetry[] poemAuthor = new Poetry [0];
		
		
		for (int i = 0; i < poems.length; i++) {

			if (poems[i].getAuthor().equals(author)) {
				
				Poetry[] temp = new Poetry [poemAuthor.length + 1];
				
				for (int j = 0; j < poemAuthor.length; j++) {
					
					temp[j] = poemAuthor[j];
					
				}
				
				temp[temp.length - 1] = poems[i];
				
				poemAuthor = temp;
				
			}
		}
		
		return poemAuthor; 
	}
	
	public void printBinary(byte[] getBytes) {
		
	  int count = 0;
		
	 
	 StringBuilder binary = new StringBuilder();
	 
	 for (byte b : getBytes)
	  {
	     int val = b;
	     
	     for (int i = 0; i < 8; i++)
	     {
	        binary.append((val & 128) == 0 ? 0 : 1); // conditional ? true : false //> if byte & 128 equals zero 
	        
	        val <<= 1;
	     }
	     
	     binary.append(' ');
	  }
	 
	 binary.toString();
	 
	 for (int i = 0; i < binary.length(); i++) {
		
		 if (binary.charAt(i) == ' ') {
			 
			 //for every space increase count
			
			 count++;
		 }
			
		if (count % 8 == 0 && count != 0) {
			
			//if count is divisble by eight and count is not equal to zero
				
		 System.out.println(); //count goes up everyspace
		 
		 	count = 0;
		 	
		 	//reset count
		 
		 continue;
				
		}
			
		System.out.print(binary.charAt(i));
			
	}
		
	 	
	}
	
}




