package Introduction;

import java.util.Iterator;

// 2d-array = 1d array + 1d-array
public class TwoDArray {
	public static void main(String[] args) {
		
//	
//	int a[][]=new int[3][2];// 3 is shows row and 2 is show colom
//    a[0][0] =5;
//    a[0][1] =2;
//    a[1][0] =4;
//    a[1][1] =5;
//    a[2][0] =6;
//    a[2][1] =8;
		// also provide value this type 
		int[][]a= {
				{5,2},
				{8,3},
				{9,4}
				
		};
    
	for (int i = 0; i < 3; i++) {
		 for(int j=0;j<2;j++) {
			 System.out.print(a[i][j]+" ");
			 
			 
		 }
		 System.out.println();
		
	}
	
	}
}
