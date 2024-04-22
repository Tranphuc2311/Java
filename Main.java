package hoctap;

import java.util.Scanner;

public class Main {
	public static void giaiphuongtrinhbacnhat(int a, int b) {

		System.out.printf("nghiem cua phuong trinh bac nhat %dx+d=0 la: ", a, b);
		if (a == 0 && b == 0) {
			System.out.println("phuong trinh vo nghiem");

		} else if (a == 0 && b != 0) {
			System.out.println("phuong trinh vo so nghiem:");
		} else {
			double x = (double) -b / a;
			System.out.printf("phuong trinh co nghiem la %.3f: ", x);
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap so a:");
		int a = scanner.nextInt();
		System.out.println("nhap so b:");
		int b = scanner.nextInt();
		System.out.println("nhap so c:");
		int c = scanner.nextInt();
		System.out.printf("nghiem cua phuong trinh bac nhat %dx^2+%dx+%d=0 la: ", a, b, c);
		if (a == 0) {
			giaiphuongtrinhbacnhat(b, c);

		} else {
			int delta = b * b - 4 * a * c;
			if (delta > 0) {
				System.out.println("phuong trinh vo so nghiem: ");
			} else if (delta == 0) {
				double x = (double) -b / a * a;
				System.out.printf("pt co nghiem:", x);

			} else {
				double x1 = (-b - Math.sqrt(delta)) / (2 * a);
				double x2 = (-b + Math.sqrt(delta)) / (2 * a);
				System.out.printf("pt co 2 nghiem phan biet x1 =%.3f va x2=%,3f", x1, x2);

			}

		}
		scanner.close();

	}

}