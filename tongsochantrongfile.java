package hoctap;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class tongsochantrongfile {
	public static void main(String[] args) {

		String fileName = "C:\\Users\\ACER\\Downloads\\quangtai.txt";
		int tongsochan = 0;

		try {
			File file = new File(fileName);

			Scanner scanner = new Scanner(file);

			while (scanner.hasNext()) {
				try {
					int i = scanner.nextInt();
					if (i % 2 == 0)
						tongsochan += i;
				} catch (NumberFormatException e) {
					// Bỏ qua nếu không phải là số
				}
			}
			System.out.println("Tổng các số chẵn trong file là: " + tongsochan);
		} catch (IOException e) {
			System.err.println("Đã xảy ra lỗi khi đọc file: " + e.getMessage());
		}
	}

}