package test;

public class Test {
	
	public static void main(String arg[]) {
		printSequence("000009", 6);
	}
	
	static void printSequence(String seqNum, int maxDigit) {
		Integer num = Integer.parseInt(seqNum) + 1;
		int len = String.valueOf(num).length();
		StringBuilder st = new StringBuilder();
		for(int i=0;i<maxDigit-len;i++) {
			st.append(0);
		}
		st.append(num);
		System.out.println(st);
	}

}

/*
 * Input: Starting sequence number is 00001 Sequence number max digits size is 5
 * Output: 00002 00003 .... .... 00010 .... 00122 ..... ..... 99999
 * 
 * Input: array --> 4, 7, 1, 6, 3, 4, 7, 1, 1
 */
