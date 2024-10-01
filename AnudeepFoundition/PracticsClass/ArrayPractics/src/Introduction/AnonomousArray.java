package Introduction;

class calc{
	public int add(int nums[]) {
		int result=0;
		for(int n:nums) {
			result=result+n;
		}
		return result;
		
	}
	
	
}

public class AnonomousArray {
	public static void main(String[] args) {
		calc ssCalc =new calc();
		int result =ssCalc.add(new int [] {5,3,4,6});
		System.out.println(result);
	}

}
