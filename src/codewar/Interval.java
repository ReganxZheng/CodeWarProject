package codewar;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Interval {
	public static int sumIntervals(int[][] intervals) {
		Set<Integer> keySet = new HashSet<Integer>();
		try {
		if(intervals.length == 0) return 0;	
		for(int i=0;i<intervals.length;i++) {
			for(int k=intervals[i][0]; k<intervals[i][1];k++) {
				keySet.add(k);
			}
		}
		
		} catch(NullPointerException ex) {
		}
		return keySet.size();
	}
	
	public static int[] overlapeArray(int[] one, int[] two) {
		int low = Integer.MAX_VALUE, high= Integer.MIN_VALUE;
		for(int i:one) {
			if(i<low) {
				low = i;
			}
			if(i>high) {
				high = i;
			}
		}
		for(int i:two) {
			if(i<low) {
				low = i;
			}
			if(i>high) {
				high = i;
			}
		}
		return new int[] {low, high};
	}
	
	public static boolean overlaped(int[] one, int[] two) {
		// {1,4} to {3,5} or {3,5} to {1,4}
		if((one[1] >= two[0] && one[1] <= two[1])) return true;
		// {3,5} to {1,4}
		else if (one[0] <= two[1] && one[1] >= two[1]) return true;
		// {1,7} to {2,5}
		else if(one[0] <= two[0] && one[1] >= two[1]) return true;
		// {2,5} to {1,7}
		else if(one[0] >= two[0] && one[1] <= two[1]) return true;
		else return false; 
	}
	public static void main(String[] args) {
//		System.out.println(sumIntervals(new int[][]{}));
//		System.out.println(overlaped(new int[] {1,4}, new int[] {3,5}));
//		System.out.println(overlaped(new int[] {3,5}, new int[] {1,4}));
//		System.out.println(overlaped(new int[] {2,7}, new int[] {1,8}));
//		System.out.println(overlaped(new int[] {1,8}, new int[] {2,7}));
//		System.out.println(overlaped(new int[] {1,4}, new int[] {5,9}));
//		System.out.println(overlaped(new int[] {1,9}, new int[] {10,10}));
//		int[] temp = overlapeArray(new int[] {2,4}, new int[] {1,5});
//		System.out.println(
		System.out.println(sumIntervals(null));
	}
}
