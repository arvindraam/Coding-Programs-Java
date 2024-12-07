package logicprogram;

public class Equi {
	
	public static void main(String arg[]) {
		//int ar[] = {1,3,5,2,2};
		int ar[] = {6,1,3,2,1};
		findEqui(ar);
	}

	private static void findEqui(int[] ar) {
		int n = ar.length;
		int total = 0;
		for(int i=0;i<n-1;i++) {
			total += ar[i];
			int sum = 0;
			for(int j=i+1; j<n-1; j++) {
				sum += ar[j+1];
				if(total == sum) {
					System.out.println(i+1);
				}
			}
		}
	}

}
