package stringprogram;

public class ReverseString {

	public static void main(String args[]) {
		String input = "main";
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(input);
		sb.reverse();
		
		System.out.println(sb);
		
		char[] inputType = input.toCharArray();
		
		for(int i = inputType.length-1; i >= 0; i--) {
			System.out.print(inputType[i]);
		}
	}
}
