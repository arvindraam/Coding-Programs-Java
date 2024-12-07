package test;

public class TestFib {

	public static void main() {
		TestFib a = new TestFib();
		a.printFibonancci(10);
	}
	
	public void printFibonancci(int num) {
		int i=0;
		int j=1;
		int u=0;
		
		for(int k=0;k<10;k++) {
			
			if(u<num) {
				System.out.println(i+j);
			}
			
		}
	}
	
	// 0, 1, 1, 2, 3, 5, 8
}
