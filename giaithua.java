package hoctap;

import java.util.Scanner;

public class giaithua {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap so n: ");
		int n = scanner.nextInt();
		int giaithua = 1;
		for (int i = 1; i <= n; i++) {
			giaithua *= i;
		}
		System.out.println("giai thua cua so " + n + " la " + giaithua);

	}

}
