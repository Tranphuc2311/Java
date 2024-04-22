package hoctap;

import java.util.Scanner;

public class bac2 {
	public static void giaiptbacnhat(int a, int b) {
		System.out.printf("nghiem cua pt bac nhat %dx+%d=0 la ", a, b);
		if (a == 0 && b == 0) {
			System.out.println("phuong trinh vo so nghiem");
		} else if (a == 0 && b != 0) {
			System.out.println("phuong trinh vo  nghiem");

		} else {
			double x = (double) -b / a;
			System.out.printf(" %.3f ", x);

		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("nhap so a: ");
		int a = scanner.nextInt();
		System.out.println("nhap so b: ");
		int b = scanner.nextInt();
		System.out.println("nhap so c: ");
		int c = scanner.nextInt();
		System.out.printf("nghiem cua pt bac hai %dx^2+%dx+%d=0 la ", a, b, c);

		if (a == 0) {
			giaiptbacnhat(b, c);

		} else {
			int delta = b * b - 4 * a * c;
			if (delta < 0) {
				System.out.println("phuong trinh vo nghiem");
			} else if (delta == 0) {
				double x = -b / (2 * a);
				System.out.printf("phuong trinh co nghiem kep x = ", x);
			} else {
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.printf("phuong trinh co 2 nghiem rieng biet la x1 = %.3f va x2 = %.3f  ", x1, x2);
			}
		}
		scanner.close();
	}

}
