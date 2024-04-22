package hoctap;

import java.util.Scanner;

public class lab1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Nhập xâu kí tự từ người dùng
		System.out.println("Nhập một xâu kí tự: ");
		String input = scanner.nextLine();

		// Tách các từ trong xâu và đếm số lượng từ
		String[] words = input.split("\\s+");
		int wordCount = words.length;

		// In số lượng từ ra màn hình
		System.out.println("Số lượng từ trong xâu kí tự là: " + wordCount);

		scanner.close();
	}
}
