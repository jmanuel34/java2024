package principal;

import java.util.HashSet;

public class PruebaConjunto {

	public static void main(String[] args) {
		HashSet<Double> nums= new HashSet<Double>();
		nums.add(30.7);
		nums.add(80.0);
		nums.add(21.3);
		for (Double s: nums) {
			System.out.println(s);
			s=s+1;
			System.out.println(s);
		}
		HashSet<Double> nums= new HashSet<Double>();
		
	}

}
