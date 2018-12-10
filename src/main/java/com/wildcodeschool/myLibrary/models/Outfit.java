package com.wildcodeschool.myLibrary.models;

import org.springframework.stereotype.Component;

@Component
public class Outfit implements DressInterface{

	@Override
	public String DressColor() {
		return "The Wizard's dress is red";
	}

}
