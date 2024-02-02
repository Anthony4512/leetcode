package arrayandstrings

import org.example.arrayandstrings.isPalindrome
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

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

}