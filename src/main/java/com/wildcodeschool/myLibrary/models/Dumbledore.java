package com.wildcodeschool.myLibrary.models;

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
	return "Run you fools!";
	
}

@Override
public String changeDress() {
	return this.outfit.DressColor();
	
}

}
