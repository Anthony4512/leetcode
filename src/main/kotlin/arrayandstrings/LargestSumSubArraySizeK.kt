package org.example.arrayandstrings

import kotlin.math.max


fun findLargestSumWithSubArrayOfSizeK(array: IntArray, k: Int): Int {
    var answer = 0
    var left = 0
    var currSum = 0

    for (i in 0..<k) {
        currSum += array[i]
    }

    answer = currSum
    for (right in k..<array.size) {
        currSum += array[right]
        val indexToDelete = right-k
        currSum -= array[indexToDelete]
        answer = max(answer, currSum)
    }

    return answer
}