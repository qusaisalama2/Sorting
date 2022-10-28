package D101;

import java.util.Arrays;
import java.util.Scanner;



public class Selentsort {
	static Scanner sc = new Scanner(System.in);


	void getarr(int arr[], int n) {
		
		
		int x;
	
	
	
		for (int i = 0; i < n - 1; i++) //80 70 10 5 1
		{
			x = i;//80
		
			for (int j = i + 1; j < n; j++) {

				if (arr[j] < arr[x])//arr[j]=70
				{
					

		int	 temp = arr[j];
			arr[j]= arr[x];
			arr[x]=temp;
			
				}
				
				
		}
			
		}

	}

	void print(int arr[], int size) {

		System.out.print("arraya after sort:");
		for (int i = 0; i < size; i++) {

			System.out.print(arr[i]);
			System.out.print(",");
		}
		System.out.println(" ");
	}

}

