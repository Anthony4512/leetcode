package arrayandstrings

import org.example.hashing.*
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class HashingTests {

    // TwoSum
    @Test
    fun `Should return the index of 2 numbers that add up to target`() {
        val inputs = listOf(
            intArrayOf(2,7,11,15),
            intArrayOf(3,2,4),
            intArrayOf(3,3)
        )
        val targets = listOf(
            9, 6, 6
        )
        val expectedOutputs = listOf(
            intArrayOf(1,0),
            intArrayOf(2,1),
            intArrayOf(1,0)
        )
        val outputs = mutableListOf<IntArray>()

        for (i in inputs.indices) {
            outputs.add(twoSumIndicesAddUpToTarget(inputs[i], targets[i]))
        }

        for (i in outputs.indices) {
            assertContentEquals(expectedOutputs[i], outputs[i])
        }
    }

    // FirstRepeatingCharacter
    @Test
    fun `Should return the first repeating character`() {
        val inputs = listOf("abccbaacz", "abcdd")
        val expectedOutputs = listOf('c', 'd')
        val outputs = mutableListOf<Char>()

        inputs.forEach {
            outputs.add(repeatedCharacters(it))
        }
        assertContentEquals(expectedOutputs, outputs)
    }

    // PangramSentence
    @Test
    fun `Should return true if sentence contains all alphabet letters, false otherwise`() {
        val inputs = listOf("thequickbrownfoxjumpsoverthelazydog", "leetcode")
        val expectedOutputs = listOf(true, false)
        val outputs = mutableListOf<Boolean>()

        for (input in inputs) {
            outputs.add(isSentencePangram(input))
        }
        assertContentEquals(expectedOutputs, outputs)
    }

    // MissingNumber
    @Test
    fun `Should return the missing number from 0 to the size of the nums array`() {
        val inputs = listOf(intArrayOf(3,0,1), intArrayOf(0,1), intArrayOf(9,6,4,2,3,5,7,0,1))
        val expectedOutputs = listOf(2,2,8)
        val outputs = mutableListOf<Int>()

        for (input in inputs) {
            outputs.add(missingNumber(input))
        }
        assertContentEquals(expectedOutputs, outputs)

    }

    // CountingNumbers
    @Test
    fun `Should return the count of numbers in the array which number+1 exist in such array`() {
        val inputs = listOf(intArrayOf(1,2,3), intArrayOf(1,1,3,3,5,5,7,7))
        val expectedOutputs = listOf(2,0)
        val outputs = mutableListOf<Int>()

        for (input in inputs) {
            outputs.add(countElements(input))
        }
        assertContentEquals(expectedOutputs, outputs)
    }

    //LongestDistinctCharSubArray
    @Test
    fun `Should return the longest distinct characters subarray with at most k distinct chars`() {
        val input = "ecebababba"
        val k = 2
        val expectedOutput = 7

        val output = longestDistinctCharSubString(input, k)

        assertEquals(expectedOutput, output)
    }

    //IntersectionOfMultipleArrays
    @Test
    fun `Should return the number that appears in all arrays sorted by ascending order`() {
        val inputs = listOf(
            arrayOf(intArrayOf(3,1,2,4,5), intArrayOf(1,2,3,4), intArrayOf(3,4,5,6)),
            arrayOf(intArrayOf(1,2,3), intArrayOf(4,5,6)),
            arrayOf(intArrayOf(7,34,45,10,12,27,13), intArrayOf(27,21,45,10,12,13))
        )
        val expectedOutputs = listOf(listOf(3,4), emptyList(), listOf(10,12,13,27,45))
        val outputs = mutableListOf<List<Int>>()
        for (input in inputs) {
            outputs.add(intersection(input))
        }
        assertContentEquals(expectedOutputs, outputs)
    }

    //AreOccurrenceEqual
    @Test
    fun `Should return true if the occurrence of all character in the string are equal`() {
        val inputs = listOf("abacbc", "aaabb")
        val expectedOutputs = listOf(true, false)
        val outputs = mutableListOf<Boolean>()

        for (input in inputs) {
            outputs.add(areOccurrencesEqual(input))
        }

        assertContentEquals(expectedOutputs, outputs)
    }
}
