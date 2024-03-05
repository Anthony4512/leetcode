package org.example.hashing

/*
    A pangram is a sentence where every letter of the English alphabet appears at least once.
    Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

    Example 1:

    Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
    Output: true
    Explanation: sentence contains at least one of every letter of the English alphabet.

    Example 2:

    Input: sentence = "leetcode"
    Output: false

 */

fun isSentencePangram(sentence: String): Boolean {
    val pangramSet = mutableSetOf<Char>()
    for (l in sentence) {
        pangramSet.add(l)
        if (pangramSet.size == 26) break
    }

    return pangramSet.size == 26
}