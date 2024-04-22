package hoctap;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("tên: ");
		String ten = scanner.nextLine();
		System.out.println("điểm: ");
		int diem = scanner.nextInt();
		System.out.println("your name is :" + ten + " có điểm bằng " + diem);
		scanner.close();

	}
}
