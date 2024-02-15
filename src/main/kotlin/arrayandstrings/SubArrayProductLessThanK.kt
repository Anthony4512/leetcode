package org.example.arrayandstrings

/*
    https://leetcode.com/problems/subarray-product-less-than-k/description/
    713. Subarray Product Less Than K.
    Given an array of positive integers nums and an integer k,
    return the number of subarrays where the product of all the elements in the subarray is strictly less than k.
    For example, given the input nums = [10, 5, 2, 6], k = 100, the answer is 8.
    The subarrays with products less than k are: [10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
 */

fun numSubarrayProductLessThanK(nums: IntArray, k: Int): Int {
    var answer = 0
    var left = 0
    var curr = 1

    if (k <= 1) return 0

    for (right in nums.indices) {
        curr *= nums[right]
        while(curr >= k) {
            curr /= nums[left]
            left++
        }
        answer += right-left+1
    }
    return answer
}
