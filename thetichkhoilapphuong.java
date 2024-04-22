package hoctap;

import java.util.Scanner;

public class thetichkhoilapphuong {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("cạnh: ");
		int canh = scanner.nextInt();

		double b = Math.pow(canh, 3);

		System.out.println("thể tích là:" + b);
		scanner.close();

	}

}
