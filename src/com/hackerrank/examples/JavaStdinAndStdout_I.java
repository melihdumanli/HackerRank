package com.hackerrank.examples;

import java.util.Scanner;

public class JavaStdinAndStdout_I {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x, y, z;
		x = scanner.nextInt();
		y = scanner.nextInt();
		z = scanner.nextInt();
		System.out.println(x + "\n" + y + "\n" + z);
	}
}
