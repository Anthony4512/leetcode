package org.example.arrayandstrings

import kotlin.math.max

/*
    You are given a binary string s (a string containing only "0" and "1").
    You may choose up to one "0" and flip it to a "1".
    What is the length of the longest substring achievable that contains only "1"?

    For example, given s = "1101100111",
    the answer is 5. If you perform the flip at index 2,
    the string becomes 1111100111.
 */

fun findLongestSubString(input: String): Int {
    var ans = 0
    var left = 0
    var curr = 0

    for (right in input.indices) {
        if (input[right] == '0') {
            curr++
        }
        while (curr > 1) {
            if (input[left] == '0') {
                curr--
            }
            left++
        }
        ans = max(ans, right-left+1)
    }

    return ans
}
