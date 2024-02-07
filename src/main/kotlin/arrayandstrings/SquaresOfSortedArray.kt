package org.example.arrayandstrings

import kotlin.math.abs

/*
    Given an integer array nums sorted in non-decreasing order,
    return an array of the squares of each number sorted in non-decreasing order.

    Example:
    Input: nums = [-4,-1,0,3,10]
    Output: [0,1,9,16,100]
    Explanation: After squaring, the array becomes [16,1,0,9,100].
    After sorting, it becomes [0,1,9,16,100].
 */

fun squaresOfSortedArray(input: IntArray): IntArray {
    val answer = IntArray(input.size)
    var left = 0
    var right = input.size - 1
    var currentIndex = answer.size-1

    while (left <= right) {
        val leftNumber = abs(input[left])
        val rightNumber = abs(input[right])

        if (leftNumber > rightNumber) {
            answer[currentIndex] = Math.multiplyExact(leftNumber, leftNumber)
            left++
        } else if (rightNumber > leftNumber) {
            answer[currentIndex] = Math.multiplyExact(rightNumber, rightNumber)
            right--
        } else {
            answer[currentIndex] = Math.multiplyExact(leftNumber, leftNumber)
            left++
        }
        currentIndex--

    }
    return answer
}