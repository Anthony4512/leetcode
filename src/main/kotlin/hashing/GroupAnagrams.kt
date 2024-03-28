package org.example.hashing

/*
    Given an array of strings strs, group the anagrams together.
    You can return the answer in any order.

    An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
    typically using all the original letters exactly once.

    Example 1:
    Input: words = ["eat","tea","tan","ate","nat","bat"]
    Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

    Example 2:
    Input: words = [""]
    Output: [[""]]

    Example 3:
    Input: words = ["a"]
    Output: [["a"]]

 */

fun groupAnagrams(words: Array<String>): List<List<String>> {
    val wordsMap = mutableMapOf<String, MutableList<String>>()
    for (word in words) {
        val keyword = word.toCharArray().sorted().joinToString("")
        if (wordsMap.containsKey(keyword)) {
            wordsMap[keyword]!!.add(word)
        } else {
            wordsMap[keyword] = mutableListOf(word)
        }
    }
    return wordsMap.values.toList()
}