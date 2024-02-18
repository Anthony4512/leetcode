package org.example.arrayandstrings

import kotlin.math.max

/*
    Given a binary array nums and an integer k,
    return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

    Example 1:
    Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
    Output: 6
    Explanation: [1,1,1,0,0,1,1,1,1,1,1]
    Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.

    Example 2:
    Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
    Output: 10
    Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
    Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.

 */

fun maxConsecutiveOnesIII(nums: IntArray, k: Int): Int {
    var answer = 0
    var left = 0
    var curr = 0
    var zeroes = 0

    for (right in nums.indices) {
        curr++
        if (nums[right] == 0) {
            zeroes += 1
        }
        while (zeroes > k) {
            if (nums[left] == 0) {
                zeroes--
            }
            curr--
            left++
        }
        answer = max(answer, curr)
    }

    return answer
}
