package com.PoetryGen.main;

public class PoetryMain {

	public static void main(String[] args) {
		
		Poetry monoke = new Poetry();
		
		monoke.setText("There cannot be a happy ending to the fight between the raging gods and humans. \nHowever, even in the middle of hatred and killings, there are things worth living for. A wonderful meeting, or a beautiful thing can exist. \nWe depict hatred, but it is to depict that there are more important things. \nWe depict a curse, to depict the joy of liberation.");
		
		monoke.setAuthor(" - Hayao Miazaki");
		
		monoke.addMood("melancholia");
		
		monoke.addMood("exulansis");
		
        System.out.print(monoke.getText());
        
        System.out.println(monoke.getAuthor());
        
        PoetryLibrary lib = new PoetryLibrary();
        
        System.out.println();
        
        lib.printBinary(lib.toBinary(monoke));
 
	}

}
