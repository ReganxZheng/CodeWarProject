package codewar;

public class phoneNumber {
	
	public static String createPhoneNumber(int[] numbers) {
//		String result ="";
//		for(int i=0;i<numbers.length;i++) {
//		       switch(i) {
//		         case 0: 
//		           result+="(";
//		           break;
//		         case 3:
//		           result+=") ";
//		           break;
//		         case 6:
//		           result+="-";
//		           break;
//		       }
//		       result+=Integer.toString(numbers[i]);
//		    }
//		return result;
		String phoneNumber = new String("(xxx) xxx-xxxx");
		for (int i : numbers) {
			phoneNumber = phoneNumber.replaceFirst("x", Integer.toString(i));
		}
		return phoneNumber;
	}
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5,6,7,8,9,0};
		System.out.println(createPhoneNumber(arr));
	}
}
