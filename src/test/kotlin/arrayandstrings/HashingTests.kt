package arrayandstrings

import org.example.hashing.isSentencePangram
import org.example.hashing.repeatedCharacters
import org.example.hashing.twoSumIndicesAddUpToTarget
import kotlin.test.Test
import kotlin.test.assertContentEquals

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
}