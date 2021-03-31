package week2b;


public class TwoStacks {
	
	
	 
    public int popCount(int k, int[] stack_a, int[] stack_b) {
 
        int stack_a_index = 0;
        int stack_b_index = 0;
        int count = 0;
        int sum = 0;
        
        
        while (stack_b_index < stack_b.length && sum + stack_b[stack_b_index] < k) {
            sum += stack_b[stack_b_index];
            stack_b_index++;
        }
        stack_b_index--;
        count = stack_b_index + 1;
        
        while (stack_a_index < stack_a.length && stack_b_index < stack_b.length) {
            sum += stack_a[stack_a_index];
            
            if (sum >= k) {
                while (stack_b_index >= 0) {
                    sum -= stack_b[stack_b_index];
                    stack_b_index--;
                    if (sum < k) {
                    	break;
                    }
                }
                if (sum >= k && stack_b_index < 0) {
                	stack_a_index--;
                    break;
                }
            }
            count = Math.max(stack_a_index + stack_b_index + 2, count);
            stack_a_index++;
        }
 
        return count;
    }
    public static void main(String[] args) {
		 
        int k = 11;
        int stka[] = {4, 3, 6, 7, 9};
        int stkb[] = {1, 2, 9, 5};
        
        TwoStacks mp_obj = new TwoStacks();
         
        int max_count = mp_obj.popCount(k, stka, stkb);
        System.out.println("Result: " + max_count);
        
    }
}
