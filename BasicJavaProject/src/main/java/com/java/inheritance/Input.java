package com.java.inheritance;

import java.util.Scanner;

public class Input {
	int a, b;
	void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number A");
		a = scanner.nextInt();
		System.out.println("enter the number B");
		b = scanner.nextInt();
	}
}
