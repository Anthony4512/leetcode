package org.example.hashing

fun areOccurrencesEqual(s: String): Boolean {
    val charToOccurrenceMap = mutableMapOf<Char, Int>()
    val occurrenceSet = mutableSetOf<Int>()

    for (c in s) {
        charToOccurrenceMap[c] = charToOccurrenceMap.getOrDefault(c, 0) + 1
    }

    for (v in charToOccurrenceMap.values) {
        occurrenceSet.add(v)
    }
    return occurrenceSet.size == 1
}
