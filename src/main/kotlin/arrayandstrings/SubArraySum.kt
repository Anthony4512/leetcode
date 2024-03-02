package org.example.arrayandstrings

/*
    Given an integer array nums, an array queries where queries[i] = [x, y] and an integer limit,
    return a boolean array that represents the answer to each query.
    A query is true if the sum of the subarray from x to y is less than limit, or false otherwise.

    For example, given nums = [1, 6, 3, 2, 7, 2], queries = [[0, 3], [2, 5], [2, 4]], and limit = 13,
    the answer is [true, false, true]. For each query, the subarray sums are [12, 14, 12].
*/

fun subArraySum(nums: IntArray, query: List<IntArray>, limit: Int): BooleanArray {
    val results = BooleanArray(query.size)
    val prefix = IntArray(nums.size)
    nums.forEachIndexed { i, e ->
        if (i == 0) {
            prefix[i] = e
        } else {
            prefix[i] = e + prefix[i-1]
        }
    }

    query.forEachIndexed { i, eArr ->
        val subArraySum = prefix[eArr[1]] - prefix[eArr[0]] + nums[eArr[0]]
        results[i] = subArraySum < limit
    }

    return results
}
