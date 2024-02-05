package org.example.arrayandstrings

/*
    Given a sorted array of unique integers and a target integer,
    return true if there exists a pair of numbers that sum to target,
    false otherwise.
 */

fun twoSumSorted(sortedArray: IntArray, target: Int): Boolean {
    var answer = false
    var left = 0
    var right = sortedArray.size-1

    while (left < right) {
        val sum = sortedArray[left] + sortedArray[right]
        if(sum > target) {
            right--
        }
        if (sum < target) {
            left++
        }
        if (sum == target) {
            answer = true
            break
        }
    }
    return answer
}
