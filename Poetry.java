package com.PoetryGen.main;

import java.util.*;

/**
 * @author spiritofthingss
 *
 */
public class Poetry {
	
	private String[] mood;
	
	private String author;
	
	private Date date;
	
	private String text;
	
	Poetry() {
		
		this.mood = new String[0];
		
	}
	
	Poetry(String[] mood, String author, Date date, String text) {
		
		this();
		
		this.author = author;
		
		this.date = date;
		
		this.text = text;
		
	}

	
	public String[] getMood() {
		
		return this.mood;
	}

	public void setMood(String[] mood) {
		
		this.mood = mood;
	}
	
	/*
	 * ["Happy", "Sexual"] // Original array
	 * 
	 * addMood("Frisky") // Method call
	 * 
	 * ["", "", ""] // New array created (old array length + 1)
	 * 
	 * ["Happy", "", ""] // Filling new array with old elements
	 * 
	 * ["Happy", "Sexual", ""] // continue to fill array
	 * 
	 * ["Happy", "Sexual", "Frisky"] // add latest mood to end of array
	 */
	
	public void addMood(String mood) {
		
		String[] temp = new String[this.mood.length + 1];
		
		for(int i = 0; i < this.mood.length; i++) {
			
			temp[i] = this.mood[i];
		}
		
		temp[temp.length - 1] = mood;
		
		this.mood = temp;
	}

	public String getAuthor() {
		
		return author;
	}

	public void setAuthor(String author) {
		
		this.author = author;
	}

	public Date getDate() {
		
		return this.date;
	}

	public void setDate(Date date) {
		
		this.date = date;
	}

	public String getText() {
		
		return this.text;
	}

	public void setText(String text) {
		
		this.text = text;
		
	}
	
	

}
