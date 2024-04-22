package hoctap;

import java.util.Scanner;

public class java {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap so nguyen : ");
		int a = scanner.nextInt();
		int giaithua = 1;
		for (int i = 1; i <= a; ++i) {
			giaithua *= i;
		}
		System.out.println("giai thua cua so " + a + " la " + giaithua);

	}
}
