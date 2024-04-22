package hoctap;

import java.util.Scanner;

public class thuế {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số đầu tiên : ");
		int a = scanner.nextInt();
		System.out.println("Nhập số thứ hai : ");
		int b = scanner.nextInt();
		int x = a + b;

		System.out.println("kết quả là" + x);
		scanner.close();
	}
}
