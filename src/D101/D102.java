package D101;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;
public class D102 {
	static insertntsort s1 = new insertntsort();
	static Selentsort s2 = new Selentsort();
	static bublesort s3 = new bublesort();
	static MyQuickSort s4 = new MyQuickSort();
	static MyMergeSort s5 = new MyMergeSort();
	static  Scanner sc = new Scanner(System.in);
	static    Random random= new Random();  

	public static void main(String[] args) {
			int z=1;
	while(z!=0) {


		System.out.println(" Choose the order you want to work with");
		System.out.print(" 1:Selection Sort");
		System.out.println("\t \t \t 2:Bubble Sort");
		System.out.print(" 3:Insertion Sort");
		System.out.println("\t \t \t 4:Quick Sort");
		System.out.print(" 5`:Merag sort");
	
		z = sc.nextInt();
	
		switch (z) {
		case 1: {
			System.out.println("*****plez enter size arr*****");
			int n = sc.nextInt(); /// size arr

			
			int[] arr = IntStream.generate(() -> new Random().nextInt(100)).limit(n).toArray();
			System.out.println("arr1 before sort" + Arrays.toString(arr));

long starrtime = System.currentTimeMillis();
			s2.getarr(arr, n);/// function getarr
long  endtime =System.currentTimeMillis();

			s2.print(arr, n);// function print

			
			System.out.println("that took:"+ (endtime - starrtime)+"ns");
			break;

		}
		case 2: {
			System.out.println("*****plez enter size arr*****");
			int n = sc.nextInt(); /// size arr
			int[] arr = IntStream.generate(() -> new Random().nextInt(100)).limit(n).toArray();
			System.out.println("arr1 before sort" + Arrays.toString(arr));
			long starrtime = System.currentTimeMillis();
			s3.getarr(arr, n);
			long  endtime =System.currentTimeMillis();
			s3.print(arr, n);
			System.out.println("that took:"+ (endtime - starrtime)+"ns");
			break;
		}
		case 3: {
			System.out.println("*****plez enter size arr*****");
			int n = sc.nextInt(); /// size arr
			int[] arr = IntStream.generate(() -> new Random().nextInt(100)).limit(n).toArray();
			System.out.println("arr1 before sort" + Arrays.toString(arr));
			long starrtime = System.currentTimeMillis();
			s1.getarr(arr, n);
			long  endtime =System.currentTimeMillis();
			s1.print(arr, n);
			System.out.println("\n ");
			System.out.println("that took:"+ (endtime - starrtime)+"ns");
			break;

		}
		case 4: {
			System.out.println("*****plez enter size arr*****");
			int n = sc.nextInt(); /// size arr

			int[] arr = IntStream.generate(() -> new Random().nextInt(100)).limit(n).toArray();
			
		
			s4.sort(arr, n);
	
			System.out.println("*****pl*");
		}
		
		case 5:{
			System.out.println("*****plez enter size arr*****");
			int n = sc.nextInt(); /// size arr

			int[] arr = IntStream.generate(() -> new Random().nextInt(100)).limit(n).toArray();
			System.out.println("arr1 before sort" + Arrays.toString(arr));
			long starrtime = System.currentTimeMillis();
			s5.sort(arr);
			long  endtime =System.currentTimeMillis();
			  for(int i:arr){
		            System.out.print(i);
		            System.out.print(" ");
		        } System.out.println(" \n");
		
			  System.out.println("that took:"+ (endtime - starrtime)+"ns");
		}
			
		}
		}
	}
}

