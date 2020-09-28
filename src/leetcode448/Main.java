package leetcode448;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] input = {4,3,2,7,8,2,3,1};
		
		printInput(input);
		
		printSolution(input);
	}

	private static void printSolution(int[] input) {
		FindMissingNumbersInArrayFunction solution = new FindMissingNumbersInArrayFunction();
		
		System.out.println("Solution: " + solution.findDisappearedNumbers(input));
	}

	private static void printInput(int[] input) {
		System.out.println("Input: " + Arrays.toString(input));
	}
}
