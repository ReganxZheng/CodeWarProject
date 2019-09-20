package codewar;

public class nextSquare {
	public static long findNextSquare(long sq) {
		double sqrt = Math.sqrt(sq);
		if(sqrt == (int)sqrt) {
			return (long)Math.pow(sqrt+1,2);
		}
		else return -1;
	}
	public static void main(String[] args) {
		
	}
}
