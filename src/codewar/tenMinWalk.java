package codewar;

public class tenMinWalk {
	public static boolean isValid(char[] walk) {
		int position = 0;
		if(walk.length==10) {
			for(int i=0;i<walk.length;i++) {
				switch(walk[i]) {
				case 'n':
					position++;
					break;
				case 's':
					position--;
					break;
				case 'w': 
					position+=2;
					break;
				case 'e':
					position-=2;
					break;
				}
			}
			return (position==0);
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		System.out.println(isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
}
}
