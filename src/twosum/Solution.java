package twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
	
	// brute-force
	// [2, 7, 11, 15], target 9
	// 9 - 2 == 7 - YES
	// 9 - 2 == 11
	// 9 - 2 == 15
	// 9 - 7 == 11
	// 9 - 7 == 15
	// 9 - 11 == 15
	// Complexity Analysis
	// Time complexity O(n^2)
	// Space complexity O(1) constant
	public int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
        	// i = 0, 0 < 4
            for (int j = i + 1; j < nums.length; j++) {
            	// j = (0 + 1) 1, 1 < 4
                if (nums[j] == target - nums[i]) {
                	// 7 == (9 - 2)
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

	// [2, 7, 11, 15], target 9
	// Complexity Analysis
	// Time complexity O(n)
	// Space complexity O(n) space required depends on the number of items 
	public int[] twoSumTwoPassHashTable(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement) && map.get(complement) != i) {
				return new int[] {i, map.get(complement)};
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}

	// Complexity Analysis
	// Time complexity O(n)
	// space complexity O(n)
	public int[] twoSumOnePassHashTable(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[] {i, map.get(complement)};
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(new Solution().twoSumBruteForce(new int[] {2, 7, 11, 15}, 9)));
		System.out.println(Arrays.toString(new Solution().twoSumTwoPassHashTable(new int[] {2, 7, 11, 15}, 9)));
		System.out.println(Arrays.toString(new Solution().twoSumOnePassHashTable(new int[] {2, 7, 11, 15}, 9)));
	}
}
