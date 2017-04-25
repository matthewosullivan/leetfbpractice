package medianoftwosortedarrays;

public class Solution {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		
		int nums1high = nums1[nums1.length-1];
		int nums1low = nums1[0];
		int nums2high = nums2[nums2.length-1];
		int nums2low = nums2[0];
		
		if (nums1high > nums2low) {
			
		}
		
		
		
		return 0.0;
    }
	
	public static void main(String[] args) {
		int[] nums1 = {1, 3};
		int[] nums2 = {2};
		
		new Solution().findMedianSortedArrays(nums1, nums2);
		//System.out.println(new Solution().findMedianSortedArrays(nums1, nums2));
	}
	
	
}
