package hoctap;

import java.util.Scanner;

public class chuvi {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("a: ");
		int a = scanner.nextInt();
		System.out.println("b: ");
		int b = scanner.nextInt();
		System.out.println("b: ");
		int c = (a + b) * 2;
		System.out.println("chu vi la: " + c);
		scanner.close();

	}

}
