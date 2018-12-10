package com.wildcodeschool.myLibrary.models;

import org.springframework.stereotype.Component;


public class Dumbledore implements WizardInterface{
	
private Outfit outfit;
	
	public Dumbledore(Outfit theOutfit) {
		outfit = theOutfit;
	}

	public Dumbledore() {
		// TODO Auto-generated constructor stub
	}



@Override
public String giveAdvice() {
	return "Listen Harry...";
	
}

@Override
public String changeDress() {
	return this.outfit.DressColor();
	
}

}
