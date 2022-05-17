package com.nttdata.pe.exception;

public class ExceptionJava {

	public static void main(String[] args) {
		try {
			int a[] = new int[2];
			System.out.println(a[3]);
		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println(e1);
		} catch (NumberFormatException e2) {
			System.out.println(e2);
		} finally {
			System.out.println("Finally");
		}
		
		try {
			int a[] = new int[2];
			System.out.println(a[3]);
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e1) {
			System.out.println(e1);
		} /*catch (NumberFormatException e2) {
			System.out.println(e2);
		}*/ finally {
			System.out.println("Finally");
		}
	}
	
}
