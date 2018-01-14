package com.lmartino.liskovSubstitution.after;


public class Migration {
	
	public void flySouth(Flying... wingedAnimals) {
		for (Flying animal : wingedAnimals) {
			animal.fly();
		}
	}

}
