package D101;

import java.util.Arrays;
import java.util.Scanner;

public class bublesort {

	Scanner sc = new Scanner(System.in);

	void getarr(int arr[], int n) {
		System.out.println("Enter number number of arraya");
		int x;
		int c = 0;


		for (int i = 0; i < n - 1; i++)/// 80 10 45 50 5
		{
			boolean falg = true;

			for (int j = 0; j < n - i - 1; j++) {

				if (arr[j] > arr[j + 1])// arr[j]=80 arr[j+1]=10

				{

					x = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = x;
					falg = false;

				}
				c++;

			}
			if (falg == true)
				break;

		}
		System.out.println("#reands" + c);

	}

	void print(int arr[], int size) {

		System.out.print("arraya after sort:");
		for (int i = 0; i < size; i++) {

			System.out.print(arr[i]);
			System.out.print(",");
		}	System.out.println(" ");
	}

}
