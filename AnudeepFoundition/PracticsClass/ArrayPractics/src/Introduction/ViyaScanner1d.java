package Introduction;

import java.util.Scanner;

public class ViyaScanner1d {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=scanner.nextInt();
		int arr[]=new int[size];
	    System.out.println("Enter "+size+"element:");
	    for(int i=0;i<size;i++) {
	    	arr[i]=scanner.nextInt();
	    }
	    
	    // for output
	    for(int i=0;i<size;i++)
	    	System.out.print(arr[i]+" ");
	    
	}
	
}
