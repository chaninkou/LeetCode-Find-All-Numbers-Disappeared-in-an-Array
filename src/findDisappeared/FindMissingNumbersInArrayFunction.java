package findDisappeared;

import java.util.ArrayList;
import java.util.List;

public class FindMissingNumbersInArrayFunction {
	 public List<Integer> findDisappearedNumbers(int[] nums) {
	        List<Integer> list = new ArrayList<Integer>();
	        
	        for(int i = 0; i < nums.length; i++){
	            // Since the element can not be bigger than the size of the array
	            // We have to put subtact 1
	            // System.out.println(nums.length);
	            // If the length is 8 and the index could only be 7 or less
	            int val = Math.abs(nums[i]) - 1;
	            
	            // Mark the number we have seen before with negative
	            if(nums[val] > 0){
	                nums[val] = -nums[val];
	            }
	        }
	        
	        for(int i = 0; i < nums.length; i++){
	            // We will start from beginning to end,
	            // We will know which one is missing when that index is positive
	            if(nums[i] > 0){
	                list.add(i+1);
	            }
	        }
	    
	        return list;
	    }
}
