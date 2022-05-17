package com.nttdata.pe;

public class Calculation {

	int z;
	
	public void addition(int x, int y) {
		z = x + y;
		System.out.println("The sum of the given numbers: " + z);
	}
	
	public void subtraction(int x, int y) {
		z = x - y;
		System.out.println("The sum of the given numbers: " + z);
	}
	
	void division(int x, int y) throws ArithmeticException {		
		z = x / y;
		System.out.println("Division: " + z);
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
}
