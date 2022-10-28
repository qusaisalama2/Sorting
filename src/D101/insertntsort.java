package D101;

import java.util.Arrays;
import java.util.Scanner;

public class insertntsort {

	Scanner sc = new Scanner(System.in);

	void getarr(int arr[], int size) {
		


		for (int i = 1; i < size; i++)// 40 20 10 50 9
		// 20 40
		{
			int key = arr[i];// 20
			int j = i - 1;// 40
			for (j = i - 1; j >= 0 && arr[j] > key; j = j - 1) {
				arr[j + 1] = arr[j];

			}
			arr[j + 1] = key;
		}

	}

	void print(int arr[], int size) {

		System.out.print(" after sort:");
		for (int i = 0; i < size; i++) {

			System.out.print(arr[i]);
			System.out.print(",");
		}
		System.out.println(" ");
	}

}
