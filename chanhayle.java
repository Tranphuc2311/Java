package hoctap;

import java.util.Arrays;

public class chanhayle {
	public static void main(String[] args) {
		int[] array = { 12345, 54321, 98765, 67890, 23456 };

		int secondLargest = findSecondLargest(array);

		System.out.println("Số lớn thứ hai trong mảng là: " + secondLargest);
	}

	public static int findSecondLargest(int[] array) {
		Arrays.sort(array); // Sắp xếp mảng theo thứ tự tăng dần

		// Vì đã sắp xếp mảng, số lớn thứ hai sẽ ở phần tử kế cuối trong mảng
		return array[array.length - 1];
	}
}