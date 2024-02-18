package org.example.arrayandstrings

/*
    Given a string s, return true if the s can be palindrome after deleting at most one character from it.
    Example 1:
    Input: s = "aba"
    Output: true

    Example 2:
    Input: s = "abca"
    Output: true
    Explanation: You could delete the character 'c'.

    Example 3:
    Input: s = "abc"
    Output: false

 */

// ValidPalindrome
fun almostPalindrome(inputString: String): Boolean {
    var left = 0
    var right = inputString.length-1
    while (left < right) {
        if (inputString[left] != inputString[right]) {
            return isPalin(inputString, left, right-1) || isPalin(inputString, left+1, right)
        }
        left++
        right--
    }

    return true
}

private fun isPalin(s: String, startIndex: Int, endIndex: Int): Boolean {
    var left = startIndex
    var right = endIndex

    while (left < right) {
        if (s[left] != s[right]) {
            return false
        }
        left++
        right--
    }

    return true
}
