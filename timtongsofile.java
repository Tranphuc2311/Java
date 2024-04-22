package hoctap;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class timtongsofile {
	public static void main(String[] args) {
		// Tên file cần đọc
		String filename = "C:\\\\Users\\\\ACER\\\\Downloads\\\\quangtai.txt";

		// Biến lưu tổng các số
		int tong = 0;

		try {
			// Mở file
			File file = new File(filename);
			Scanner scanner = new Scanner(file);

			// Đọc từng số từ file và tính tổng các số
			while (scanner.hasNextInt()) {
				tong += scanner.nextInt();
			}

			// Đóng scanner
			scanner.close();

			// In tổng các số ra màn hình console
			System.out.println("Tổng các số trong file là: " + tong);
		} catch (FileNotFoundException e) {
			// Xử lý ngoại lệ nếu file không tồn tại
			System.out.println("Không tìm thấy file " + filename);
		}
	}
}
