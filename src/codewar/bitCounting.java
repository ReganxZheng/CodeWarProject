package codewar;

public class bitCounting {
	public static int countBits(int n) {
		String binary = Integer.toBinaryString(n);
		String[] split = binary.split("");
		int count = 0;
		for(String s:split) {
			if(s.equals("1")) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(countBits(1234));
	}
}
