package com.wildcodeschool.myLibrary.models;

public class Gandalf implements WizardInterface{

	private Outfit outfit;
	
	public Gandalf(Outfit theOutfit) {
		outfit = theOutfit;
	}
	
	public Gandalf() {
		
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
