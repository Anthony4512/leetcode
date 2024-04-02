package org.example.hashing

/*
    Given two strings ransomNote and magazine,
    return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
    Each letter in magazine can only be used once in ransomNote.

    Example 1:
    Input: ransomNote = "a", magazine = "b"
    Output: false

    Example 2:
    Input: ransomNote = "aa", magazine = "ab"
    Output: false

    Example 3:
    Input: ransomNote = "aa", magazine = "aab"
    Output: true
 */

fun canConstructRansomNote(ransomNote: String, magazine: String): Boolean {
    if(ransomNote.length > magazine.length) return false

    var canBeConstructed = true

    val magazineCharMap = mutableMapOf<Char, Int>()
    magazine.forEach { c ->
        magazineCharMap[c] = magazineCharMap.getOrDefault(c, 0) + 1
    }

    ransomNote.forEach { c ->
        magazineCharMap[c] = magazineCharMap.getOrDefault(c, 0) - 1
    }

    magazineCharMap.values.forEach { v ->
        if (v < 0)  canBeConstructed = false
    }

    return canBeConstructed
}



//class Solution {
//    fun canConstruct(ransomNote: String, magazine: String): Boolean {
//        if(ransomNote.length > magazine.length) return false
//
//        var magazineCharMap = mutableMapOf<Char, Int>()
//        var canBeConstructed = true
//
//        for(c in magazine) {
//            var charValInMap = magazineCharMap.get(c)
//            if(charValInMap == null) {
//                magazineCharMap.put(c, 1)
//            } else {
//                magazineCharMap.put(c, charValInMap + 1)
//            }
//        }
//
//        for(c in ransomNote) {
//            var charValInMap = magazineCharMap.get(c)
//            if(charValInMap == null || charValInMap == 0) {
//                canBeConstructed = false
//            } else {
//                magazineCharMap.put(c, charValInMap - 1)
//            }
//        }
//
//
//        return canBeConstructed
//    }
//}
