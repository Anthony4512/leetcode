package org.example.hashing

/*
    Given an integer array arr, count how many elements x there are, such that x + 1 is also in arr.
    If there are duplicates in arr, count them separately.

    Example 1:
    Input: arr = [1,2,3]
    Output: 2
    Explanation: 1 and 2 are counted cause 2 and 3 are in arr.

    Example 2:
    Input: arr = [1,1,3,3,5,5,7,7]
    Output: 0
    Explanation: No numbers are counted, cause there is no 2, 4, 6, or 8 in arr.

 */

fun countElements(nums: IntArray): Int {
    var count = 0
    val countSet = mutableMapOf<Int,Int>()
    for (num in nums) {
        countSet[num] = countSet.getOrDefault(num, 0)
    }

    for (num in nums) {
        if (countSet.containsKey(num+1)) count++
    }

    return count
}