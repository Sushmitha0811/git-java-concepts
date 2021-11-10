package com.java.encapsulation;

public class AreaEncapsulation {
	int l;
	int b;

	AreaEncapsulation(int length, int breadth) {
		this.l = length;
		this.b = breadth;
	}

	public void getAreaEncapsulation() {
		int area = l * b;
		System.out.println("EncapsulationArea: " + area);
	}
}
