package hoctap;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {

		String fileName = "C:\\\\Users\\\\ACER\\\\Downloads\\\\quangtai.txt";
		int tongchan = 0;
		try {
			File file = new File(fileName);
			Scanner scanner = new Scanner(file);
			while (scanner.hasNext()) {
				try {
					int i = scanner.nextInt();
					if (i % 2 == 0)
						tongchan += i;

				} catch (NumberFormatException e) {

				}
			}
			System.out.println("tong so chan trong file:" + tongchan);
		} catch (FileNotFoundException e) {
			System.out.println("ko tim thay file" + fileName);
		}

	}
}