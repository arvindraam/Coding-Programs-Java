package test;

public class TestThree {

	public static void main(String ar[]) {
		String s = "start";
		reverseString(s);
	}

	private static void reverseString(String s) {
		char[] ch = s.toCharArray();
		for(int i=ch.length-1; i>=0; i--) {
			System.out.print(ch[i]);
		}
	}
}
