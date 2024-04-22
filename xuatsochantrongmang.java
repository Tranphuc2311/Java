package hoctap;

import java.util.Scanner;

public class xuatsochantrongmang {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap so phan tu cua mang: ");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		System.out.println("nhap cac phan tu cua mang: ");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("so phan tu chan cua mang la: ");
		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 != 0) {
				System.out.println(arr[i]);
			}
		}

	}

}
