package week2a;


public class BalancedParenthesis {
	
	boolean checkBalanced(String input) {
		
		String openBraces = "[{(";
		String closedBraces = "]})";
		int length = input.length();
		
		Stack obj = new Stack(length);

		for(int i=0; i<length; i++) {
	
			char braces = input.charAt(i);
			

			if(openBraces.indexOf(braces) != -1) {
			
				obj.push(braces);
				
			} else {
			
				int closed_indx = closedBraces.indexOf(braces);
				char similar_to_open = openBraces.charAt(closed_indx);
				if(obj.pop() != similar_to_open) {
					return false;
				}
			}
			
		}
		
	
		if(obj.peak() == -1) {
			return true;
		} else {
			return false;
		}	
	}
	
	public static void main(String[] args) {
		String braces_input = "{()}{}";
		BalancedParenthesis bp = new BalancedParenthesis();
		boolean final_output = bp.checkBalanced(braces_input);
		
		System.out.println("Result is: " + final_output);
	}
}
