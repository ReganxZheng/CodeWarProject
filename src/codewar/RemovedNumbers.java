package codewar;

import java.util.List;
import java.util.LinkedList;

public class RemovedNumbers {
	public static List<long[]> removeNb(long n) {
		long sum = n*(1+n)/2;
		LinkedList<long[]> list = new LinkedList<>();
		long low = ((n-1)*n/2) / (n+1);
		long high = (long) Math.sqrt(sum+1) - 1;
		for(long i = high;i>=low;i--) {
			long k = (sum - i) / (i + 1);
			if(i * k + i + k == sum) {
				list.addFirst(new long[] {i,k});
				list.addLast(new long[] {k,i});
			}
		}
		return list;
		
//		for(long i=1;i<n;i++) {
//		for(long k=i+1;k<n;k++) {
//			if(i*k==(sum-i-k)) {
//				long[] l1 = new long[] {i, k};
//				long[] l2 = new long[] {k, i};
//				list.add(l1);
//				list.add(l2);
//			}
//		}
//	}
	}
	public static void main(String[] args) {
		
	}
}
