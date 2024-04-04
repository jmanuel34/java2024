package principal;

import java.util.HashSet;

class MyNumber {
	private Double num;

	public MyNumber(Double num) {
		super();
		this.num = num;
	}

	public Double getNum() {
		return num;
	}

	public void setNum(Double num) {
		this.num = num;
	}

}

public class PruebaConjunto2 {

	public static void main(String[] args) {
		HashSet<MyNumber> nums = new HashSet<MyNumber>();
		nums.add(new MyNumber(30.7));
		nums.add(new MyNumber(30.2));
		nums.add(new MyNumber(40.5));
		for (MyNumber n:nums) {
			n.setNum(n.getNum()+1);
		}
		for (MyNumber s : nums) {
			System.out.println(s);
			System.out.println(s.getNum());
		}

	}
}
