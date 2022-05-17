package com.nttdata.pe.interfaces;

public class Animal {

	String nombre;
	String color;
	
	public Animal() {}

	public Animal(String nombre, String color) {
		this.nombre = nombre;
		this.color = color;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", color=" + color + "]";
	}	
	
}
