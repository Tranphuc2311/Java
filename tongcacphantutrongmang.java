package hoctap;

import java.util.Scanner;

public class tongcacphantutrongmang {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap so phan tu cua mang: ");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		int sum = 0;
		System.out.println("nhap cac phan tu cua mang: ");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
			sum += arr[i];
		}
		System.out.println("nhap cac phan tu cua mang: " + sum);
	}
}
