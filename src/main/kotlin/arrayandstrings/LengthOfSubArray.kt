package org.example.arrayandstrings

import kotlin.math.max

/*
    Given an array of positive integers nums and an integer k,
    find the length of the longest subarray whose sum is less than or equal to k.
    This is the problem we have been talking about above. We will now formally solve it.
 */
fun findLengthOfSubArray(arr: IntArray, k: Int): Int {
    var ans = 0
    var left = 0
    var curr = 0

    for (right in arr.indices) {
        curr += arr[right]
        while (curr > k) {
            curr -= arr[left]
            left++
        }
        ans = max(ans, (right-left)+1)
    }
    return ans
}