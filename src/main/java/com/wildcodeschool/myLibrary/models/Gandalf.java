package com.wildcodeschool.myLibrary.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("theWizard")
public class Gandalf implements WizardInterface{

	private Outfit outfit;
	
	@Autowired
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
