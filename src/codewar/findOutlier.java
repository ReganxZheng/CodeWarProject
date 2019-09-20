package codewar;

import java.util.ArrayList;

public class findOutlier {
	public static int find(int[] integers) {
		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();
		for(int i:integers) {
			if(i%2==0) {
				even.add(i);
			}
			else {
				odd.add(i);
			}
			
		}
		return even.size() == 1 ? even.get(0) : odd.get(0);
	}
	public static void main(String[] args) {
		System.out.println(find(new int[]{206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781}));
	}
}
