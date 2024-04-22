package hoctap;

import java.util.Scanner;

public class canhnhonhat {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số phần tử trong mảng: ");
		int a = scanner.nextInt();
		int[] arr = new int[a];

		System.out.println("nhập các phần tử của mảng: ");
		for (int i = 0; i < a; i++) {
			arr[i] = scanner.nextInt();

		}
		System.out.println("số phần tử chẵn của mảng là: ");
		for (int i = 0; i < a; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
	}
}
