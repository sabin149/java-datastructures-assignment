package week1b;
import java.util.*;

public class MissingElement {
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2,3,5,11,17,23));
		int start = list.get(0);
		int index = list.size()-1;
		int last = list.get(index);
		
		ArrayList<Integer> prime_numbers = new ArrayList<>();
		
			
		
	    while (start <= last) {
	        boolean flag = false;
	
	        for(int i = 2; i <= start/2; ++i) {

	            if(start % i == 0) {
	                flag = true;
	                break;
	            }
	        }
	
	        if (!flag && start != 0 && start != 1)
	        prime_numbers.add(start);
	
	        ++start;
	    }
	    
	    for(int i =0 ; i<list.size(); i++) {
	    	
	    	for(int j = 0; j<prime_numbers.size(); j++) {
	    		
	    		if(list.get(i) == prime_numbers.get(j)) {
	    			
	    			prime_numbers.remove(j);
	    		
	    		}
	    	}
	    }
	    
	    System.out.println(prime_numbers);
	    
	    
	}
}
