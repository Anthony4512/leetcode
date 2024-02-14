package org.example.arrayandstrings

import kotlin.math.max

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