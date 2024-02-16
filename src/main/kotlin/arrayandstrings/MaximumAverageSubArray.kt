package org.example.arrayandstrings

import kotlin.math.max

/*

    You are given an integer array nums consisting of n elements, and an integer k.
    Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value.
    Any answer with a calculation error less than 10-5 will be accepted.

    Example 1:
    Input: nums = [1,12,-5,-6,50,3], k = 4
    Output: 12.75000
    Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75

    Example 2:
    Input: nums = [5], k = 1
    Output: 5.00000

 */
fun findMaximumAverageSubArray(nums: IntArray, k: Int): Double {
    var currSum = 0.0

    for (i in 0..<k) {
        currSum += nums[i]
    }

    var answer: Double = currSum/k

    for (right in k..<nums.size) {
        currSum += nums[right] - nums[right-k]
        answer = max(answer, currSum/4)
    }


    return answer
}