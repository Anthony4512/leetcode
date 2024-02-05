package org.example.arrayandstrings

/*
    Given two sorted integer arrays arr1 and arr2,
    return a new array that combines both of them and is also sorted.
 */

fun mergeSortedArrays(arr1: IntArray, arr2: IntArray): IntArray {
    var left = 0
    var right = 0
    var currentIndex = 0
    val mergedArray = IntArray(arr1.size + arr2.size)

    while (left < arr1.size && right < arr2.size) {
        if (arr1[left] < arr2[right]) {
            mergedArray[currentIndex] = arr1[left]
            currentIndex++
            left++
        } else if (arr2[right] < arr1[left]) {
            mergedArray[currentIndex] = arr2[right]
            currentIndex++
            right++
        } else if (arr2[right] == arr1[left]) {
            mergedArray[currentIndex] = arr1[left]
            currentIndex++
            left++
            mergedArray[currentIndex] = arr2[right]
            currentIndex++
            right++
        }
    }

    while (left < arr1.size) {
        mergedArray[currentIndex] = arr1[left]
        currentIndex++
        left++
    }
    while (right < arr2.size) {
        mergedArray[currentIndex] = arr2[right]
        currentIndex++
        right++
    }


    return mergedArray
}
