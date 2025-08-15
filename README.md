# Median-of-Two-Sorted-Arrays
Java solution to the LeetCode problem 'Median of Two Sorted Arrays' with approach explanation.
Median of Two Sorted Arrays
Problem Statement

You are given two sorted arrays nums1 and nums2 of size m and n respectively. Your task is to find the median of the two sorted arrays. The overall run time complexity should be O(log(m + n)).

Example 1:

Input: nums1 = [1,3], nums2 = [2]  
Output: 2.00000  
Explanation: Merged array = [1,2,3], median = 2  


Example 2:

Input: nums1 = [1,2], nums2 = [3,4]  
Output: 2.50000  
Explanation: Merged array = [1,2,3,4], median = (2 + 3) / 2 = 2.5  


Constraints:

0 <= m <= 1000

0 <= n <= 1000

1 <= m + n <= 2000

-10^6 <= nums1[i], nums2[i] <= 10^6

Approach



1. Initialize three pointers: i for nums1, j for nums2, and k for the merged array r.

2. Traverse both arrays, inserting the smaller element into r until one array is exhausted.

3. Append the remaining elements from the other array.

4. Find the length of the merged array.

  - If odd, the median is the middle element.

  - If even, the median is the average of the two middle elements.
