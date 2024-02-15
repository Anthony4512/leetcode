package arrayandstrings

import org.example.arrayandstrings.*
import org.junit.jupiter.api.Test
import kotlin.test.*

class ArrayAndStringTests {

    // Palindrome Tests
    @Test
    fun `Should return true when is a palindrome`() {
        val input = "racecar"
        val isPalindrome = isPalindrome(input)
        assertTrue(isPalindrome)
    }

    @Test
    fun `Should return false when is not a palindrome`() {
        val input = "racecars"
        val isPalindrome = isPalindrome(input)
        assertFalse(isPalindrome)
    }

    // TwoSum Sorted tests
    @Test
    fun `Should return false when no numbers sums up to target number`() {
        val input = intArrayOf(1, 2, 3, 6, 8, 9, 14, 15)
        val target = 13
        val answer = twoSumSorted(input, target)

        assertFalse(answer)
    }

    @Test
    fun `Should return true when 2 numbers sums up to target number`() {
        val input = intArrayOf(1, 2, 4, 6, 8, 9, 14, 15)
        val target = 13
        val answer = twoSumSorted(input, target)

        assertTrue(answer)
    }

    // ArrayMerge
    @Test
    fun `Should return merged sorted array`() {
        val arr1 = intArrayOf(1,3,5,7,8,9,16)
        val arr2 = intArrayOf(2,4,6,9,10,12,15)
        val expectedArray = intArrayOf(1,2,3,4,5,6,7,8,9,9,10,12,15,16)

        val answer = mergeSortedArrays(arr1, arr2)

        assertContentEquals(expectedArray, answer)
    }

    // ReverseString
    @Test
    fun `Should return the reverse string of any string input`() {
        val inputCharArr = charArrayOf('h','o','u','s','e')
        val expectedOutput = charArrayOf('e','s','u','o','h')

        assertNotEquals(inputCharArr.joinToString(), expectedOutput.joinToString())

        reverseString(inputCharArr)

        assertEquals(expectedOutput.joinToString(), inputCharArr.joinToString())
    }

    //SquareOfSortedArray
    @Test
    fun `Should return a sorted array of the squares of the input array`() {
        val inputArray = intArrayOf(-4,-1,0,3,10)
        val expectedOutputArray = intArrayOf(0,1,9,16,100)

        val outputArray = squaresOfSortedArray(inputArray)

        assertContentEquals(expectedOutputArray, outputArray)
    }

    // LengthOfSubArray
    @Test
    fun `Should return the length of the longest sub array that sums to k`() {
        val arr = intArrayOf(3, 1, 2, 7, 4, 2, 1, 1, 5)
        val k = 8
        val expectedOutput = 4

        val currentOutput = findLengthOfSubArray(arr, k)

        assertEquals(expectedOutput, currentOutput)
    }

    // LengthOfSubString
    @Test
    fun `Should return the length of the longest subString that only contains 1s and at most one 0`() {
        val inputString = "1101100111"
        val expectedOutput = 5

        val currentOutput = findLongestSubString(inputString)

        assertEquals(expectedOutput, currentOutput)
    }

    // SubArrayProductLessThanK
    @Test
    fun `Should return all sub arrays that their product is less than k`() {
        val inputArr = intArrayOf(10,5,2,6)
        val k = 100
        val expectedOutput = 8

        val currOutput = numSubarrayProductLessThanK(inputArr, k)

        assertEquals(expectedOutput, currOutput)
    }

    @Test
    fun `Should return 0 when k is one or less`() {
        val inputArr = intArrayOf(10,5,2,6)
        val k = 1
        val expectedOutput = 0

        val currOutput = numSubarrayProductLessThanK(inputArr, k)

        assertEquals(expectedOutput, currOutput)
    }



}
