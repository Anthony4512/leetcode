package org.example.hashing

/*

    Given a 0-indexed n x n integer matrix grid, return the number of pairs (r[i], c[j])
    such that row r[i] and column c[j] are equal.
    A row and column pair is considered equal if they contain the same elements in the same order (i.e.,an equal array).

    Example 1:
    Input: grid = [[3,2,1],[1,7,6],[2,7,7]]
    Output: 1
    Explanation: There is 1 equal row and column pair:
    - (Row 2, Column 1): [2,7,7]

    Example 2:
    Input: grid = [[3,1,2,2],[1,4,4,5],[2,4,2,2],[2,4,2,2]]
    Output: 3
    Explanation: There are 3 equal row and column pairs:
    - (Row 0, Column 0): [3,1,2,2]
    - (Row 2, Column 2): [2,4,2,2]
    - (Row 3, Column 2): [2,4,2,2]

 */

fun equalPairs(grid: Array<IntArray>): Int {
    val rowToCountMap = mutableMapOf<String, Int>()
    val colToCountMap = mutableMapOf<String, Int>()
    val rowSequence = StringBuilder()
    val colSequence = StringBuilder()
    var result = 0
    for (col in grid.indices) {
        for (row in 0..grid[col].size-1) {
            rowSequence.append("${grid[col][row]}-")
            colSequence.append("${grid[row][col]}-")
        }

        rowToCountMap[rowSequence.toString()] = rowToCountMap.getOrDefault(rowSequence.toString(), 0) + 1
        colToCountMap[colSequence.toString()] = colToCountMap.getOrDefault(colSequence.toString(), 0) + 1

        rowSequence.clear()
        colSequence.clear()

    }

    for ((key, va) in rowToCountMap) {
        if (colToCountMap.containsKey(key)) {
            result += (va * colToCountMap[key]!!)
        }
    }

    return result
}

// A faster solution found online is this one below.
/*
    fun equalPairs(grid: Array<IntArray>): Int {
        var count = 0
        for(row in grid.indices) {
            val col = IntArray(grid.size) { col -> grid[col][row]}
            for(row in grid) {
                if(col contentEquals row)
                    count++
            }
        }
        return count
    }
 */