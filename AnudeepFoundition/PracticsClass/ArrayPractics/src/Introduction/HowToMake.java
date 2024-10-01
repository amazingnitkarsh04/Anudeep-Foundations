package Introduction;
/*Type of array
 * 1d
 * 2d\
 * jacked arry
 */

public class HowToMake {
  public static void main(String[] args) {
	  // 1d declartion arry inilization
	  int[]a;
	  int b[];
	  
	  int[]c= {10,20,30};
	  char[]d= {'a','e','i','o','u'};
	  String[]e= {"sachin","ramesh","tendulkar","ind"};
	  
	  System.out.println(c);// that mean these are refrence to the heap
	  System.out.println(c[0]);
	  System.out.println(c[1]);
	  System.out.println(c[2]);
	  System.out.println(d[0]);
	  System.out.println(d[1]);
	  System.out.println(d[2]);
	  System.out.println(d[3]);
	  System.out.println(d[4]);
	  // so theat is very heditic 
	  // sp we use loop in there
	  for(int i=0;i<=d.length-1;i++) {
		  System.out.println(d[i]);
	  }
	   
}

}
