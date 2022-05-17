package com.nttdata.pe;

public class MyCalculation extends Calculation {

	public void multiplication(int x, int y) {
		z = x * y;
		System.out.println("The product of the given numbers: " + z);
	}
	
	public void print() {
		System.out.println(z);
	}
	
	public static void main(String[] args) {
		int a, b;
		
		MyCalculation demo = new MyCalculation();
		try {
			a = Integer.parseInt("10");
			b = Integer.parseInt("20");
			demo.addition(a, b);
		} catch (NumberFormatException e) {
			System.err.println("Numeros no validos.");
		}
		
		a = 20; 
		b = 0;
		demo.division(demo.getZ(), b);
		
		/*demo.subtraction(a, b);
		demo.multiplication(a, b);
		System.out.println(demo.getZ());
		demo.setZ(50);
		System.out.println(demo.getZ());		
		demo.print();*/
	}
	
}
