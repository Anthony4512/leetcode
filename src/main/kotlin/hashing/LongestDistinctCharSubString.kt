package org.example.hashing

import kotlin.math.max

/*
    You are given a string s and an integer k.
    Find the length of the longest substring that contains at most k distinct characters.

    For example, given s = "eceba" and k = 2, return 3.
    The longest substring with at most 2 distinct characters is "ece"

 */

fun longestDistinctCharSubString(s: String, k: Int): Int {
    val countMap = mutableMapOf<Char, Int>()
    var left = 0
    var answer = 0

    for (right in s.indices) {
        countMap[s[right]] = countMap.getOrDefault(s[right], 0) + 1
        while (countMap.keys.size > k) {
            countMap[s[left]] = countMap.getOrDefault(s[left], 0) - 1
            if (countMap[s[left]] == 0) {
                countMap.remove(s[left])
            }
            left++
        }
        answer = max(answer, right-left+1)
    }
    return answer
}