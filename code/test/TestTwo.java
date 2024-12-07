package test;

public class TestTwo {
	
	// 0 1 1 2 3 5 8 13 21 34 55 89 
	
	public static void main(String ar[]) {
		int start=0, end=100;
		printFibonaci(start, end);
	}
	
	public static void printFibonaci(int start, int end) {
		System.out.println(start);
		int n3=0;
		int n1 = start;
		int n2 =0;
		int n22=0, n23=1;
		for(int j=0; j<=start; j++) {
			n2 = n22 + n23;
			n22 = n23;
			n23 = n2;
		}
		System.out.println(n2);
		for(int i=n2; i<=end; ++i) {
			n3 = n1+n2;
			n1 = n2;
			n2 = n3;
			if(n3<end) {
				System.out.println(n3);
			}
		}
		
		System.out.println(end);
		
	}

}
