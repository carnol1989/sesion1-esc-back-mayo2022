package com.nttdata.pe;

public class Dog {

	private String name;
	private String breed;// raza
	private int age;
	private String color;

	public Dog() {}
	
	public Dog(String name, String breed, int age, String color) {
		super();
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
	}
	
	public void barking() {
		System.out.println("Dog is barking.");
	}

	public void hungry() {
		System.out.println("Dog is hungry.");
	}

	public void sleeping() {
		System.out.println("Dog is sleeping.");
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + ", age=" + age + 
				", color=" + color + "]";
	}	
	
}
