package com.nttdata.pe.interfaces;

public class Deer extends Animal implements Vegetarian {
		
	@Override
	public void print() {
		System.out.println("print from Deer!");
	}
	
	public static void main(String[] args) {
		Deer deer = new Deer();
		deer.setNombre("Ciervo");
		deer.setColor("Marron");
		
		System.out.println(deer);
		deer.print();
	}

}
