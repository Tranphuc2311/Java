package hoctap;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class tongso123 {
	public static void main(String[] args) {
		String filename = "C:\\\\Users\\\\ACER\\\\Downloads\\\\quangtai.txt";
		int sum = 0;
		try {
			File file = new File(filename);
			Scanner scanner = new Scanner(file);
			while (scanner.hasNext()) {
				try {
					int i = scanner.nextInt();
					if (i % 2 == 0)
						sum += i;
				} catch (NumberFormatException e) {

				}
			}
			System.out.println("tong so chan trong file la: " + sum);
		} catch (IOException e) {
			System.out.println("ko tim thay file: " + e.getMessage());

		}
	}
}
