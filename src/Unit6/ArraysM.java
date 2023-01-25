package Unit6;
import java.util.Random;
import java.util.Scanner;
public class ArraysM {
	private static Scanner k = new Scanner(System.in);
	//array int*************************************************************************************************************
	public static void displayArray(Marks[] s3) 
	{
		for (int elem : s3) 
		{
			System.out.print(elem+"\t");
		}
	}
	public static void fillArray(int []v) 
	{
		System.out.println("type "+ v.length +" int's:");
		for (int i=0;i<v.length;i++) 
		{
			v[i]=k.nextInt();k.nextLine();
		}
	}
	public static void fillArrayRandom(int []v) 
	{
		Random r = new Random();
		for (int i=0;i<v.length;i++) 
		{
			v[i]=r.nextInt(11);
		}
	}
	//array double*************************************************************************************************************
	public static void displayArray(double []v) 
	{
		for (double elem : v) 
		{
			System.out.print(elem+"\t");
		}
	}
	public static void fillArray(double []v) 
	{
		System.out.println("type "+ v.length +" double's:");
		for (int i=0;i<v.length;i++) 
		{
			v[i]=k.nextDouble();k.nextLine();
		}
	}
	public static void fillArrayRandom(double []v) 
	{
		Random r = new Random();
		for (int i=0;i<v.length;i++) 
		{
			v[i]=r.nextDouble(11);
		}
	}
	//array string*************************************************************************************************************
	public static void displayArray(String []v) 
	{
		for (String elem : v) 
		{
			System.out.print(elem+"\t");
		}
	}
	public static void fillArray(String []v) 
	{
		System.out.println("type "+ v.length +" string's:");
		for (int i=0;i<v.length;i++) 
		{
			v[i]=k.nextLine();
		}
	}
	//array char*************************************************************************************************************
	public static void displayArray(char []v) 
	{
		for (char elem : v) 
		{
			System.out.print(elem+"\t");
		}
	}
	//bubble sort*************************************************************************************************************
	public static void BubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-i-1; j++) {
				if (arr[j]>arr[j+1])
				{
					//swap arr[j+1] and arr[j]
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void BubbleSortDescending(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-i-1; j++) {
				if (arr[j]<arr[j+1])
				{
					//swap arr[j+1] and arr[j]
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	//insertion sort*************************************************************************************************************
	public static void InsertionSort(int arr[])
	{
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
			System.out.println("");
			ArraysM.displayArray(arr);
		}
	}
	public static void InsertionSortDescending(int arr[])
	{
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;
			// change from arr[j] > key to arr[j] < key
			while (j >= 0 && arr[j] < key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
			//code to print a trace
			System.out.println("");
			ArraysM.displayArray(arr);
		}
	}
	//selection sort*************************************************************************************************************
	public static void SelectionSortDescending(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n-1; i++)
		{
			// change min_idx to max_idx
			int max_idx = i;
			for (int j = i+1; j < n; j++)
				// change from (arr[j] < arr[min_idx]) to (arr[j] > arr[max_idx])
				if (arr[j] > arr[max_idx])
					max_idx = j;
			int temp = arr[max_idx];
			arr[max_idx] = arr[i];
			arr[i] = temp;
			//code to print a trace
			System.out.println("");
			ArraysM.displayArray(arr);
		}
	}
	public static void SelectionSort(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n-1; i++)
		{
			int min_idx = i;
			for (int j = i+1; j < n; j++)
				if (arr[j] > arr[min_idx])
					min_idx = j;
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
			//code to print a trace
			System.out.println("");
			ArraysM.displayArray(arr);
		}
	}
	//array int bidimensional*************************************************************************************************************
	public static void displayArray(int arr[][])
	{
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
			
		}
	}
	public static void fillArray(int [][]v) 
	{
		for (int i=0;i<v.length;i++) 
		{
			System.out.println("type row "+i);
			for (int j=0;j<v[i].length;j++)
			v[i][j]=k.nextInt();k.nextLine();
		}
	}
	public static void fillArrayRandom(int [][]v) 
	{
		Random r = new Random();
		for (int i=0;i<v.length;i++) 
		{
			for (int j=0;j<v[i].length;j++)
			v[i][j]=r.nextInt(11);
		}
	}
	//array double bidimensional*************************************************************************************************************
	public static void displayArray(double arr[][])
	{
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
			
		}
	}
	public static void fillArray(double [][]v) 
	{
		for (int i=0;i<v.length;i++) 
		{
			System.out.println("type row "+i);
			for (int j=0;j<v[i].length;j++)
			v[i][j]=k.nextDouble();k.nextLine();
		}
	}
	public static void fillArrayRandom(double [][]v) 
	{
		Random r = new Random();
		for (int i=0;i<v.length;i++) 
		{
			for (int j=0;j<v[i].length;j++)
			v[i][j]=r.nextDouble(11);
		}
	}
	//array string bidimensionalAAAAAAAAAAAAAAAAAAAAAAA******************************************************************************************
	public static void displayArray(String [][]v) 
	{
		for (String elem :v) 
		{
			System.out.print(elem+"\t");
		}
	}
	public static void fillArray(String [][]v) 
	{
		System.out.println("type "+ v.length +" string's:");
		for (int i=0;i<v.length;i++) 
		{
			v[i]=k.nextLine();
		}
	}

}