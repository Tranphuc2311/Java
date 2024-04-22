package hoctap;

import java.util.Scanner;

public class thue {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("tax :");
		int tax = scanner.nextInt();
		if (tax < 10) {
			System.out.println("khong dong thue");

		}
		if (10 <= tax && tax <= 15) {
			System.out.println("thue 10%");
		}
		if (15 <= tax && tax <= 30) {
			System.out.println("thue 20%");
		} else if (30 <= tax) {
			System.out.println("thue 50%");
		}
		scanner.close();
	}

}
