package com.java.abstraction;

abstract class OopsAbstraction {

	public abstract void sponge();

	public void absorbe() {
		System.out.println("*********");
	}
}

class Cotton extends OopsAbstraction {
	public void sponge() {
		System.out.println("----------");
	}
}

class SampleAbstraction {
	public static void main(String[] args) {
		Cotton cot = new Cotton();
		cot.sponge();
		cot.absorbe();
	}
}
