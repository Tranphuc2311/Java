package hoctap;

import java.util.Scanner;

public class bacnhat {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap so a: ");
		int a = scanner.nextInt();
		System.out.println("nhap so b: ");
		int b = scanner.nextInt();
		System.out.printf("nghiem cua pt %dx+%d=0 la ", a, b);
		if (a == 0 && b == 0) {
			System.out.println("phuong trinh vo so nghiem");
		} else if (a == 0 && b != 0) {
			System.out.println("phuong trinh vo  nghiem");

		} else {
			double x = (double) -b / a;
			System.out.printf(" %.3f ", x);

		}
	}

}
