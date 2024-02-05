package org.example.arrayandstrings

fun isPalindrome(s: String): Boolean {
    var isPalindrome = true
    var left = 0
    var right = s.length-1

    while (left < right) {
        if (s[left] != s[right]) {
            isPalindrome = false
        }
        left++
        right--
    }

    return isPalindrome
}
