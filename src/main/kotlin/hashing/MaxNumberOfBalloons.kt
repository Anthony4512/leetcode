package org.example.hashing

/*
    Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.
    You can use each character in text at most once. Return the maximum number of instances that can be formed.
 */

fun maxNumberOfBalloons(text: String): Int {
    val balloon = "balloon"
    val balloonMap = mutableMapOf<Char, Int>()
    var numOfBalloons = 0

    for(c in balloon) {
        balloonMap[c] = balloonMap.getOrDefault(c, 0)
    }

    var oCount = 0
    var lCount = 0
    for(c in text) {
        if(balloonMap.containsKey(c)) {
            if(c == 'o') {
                oCount++
                if(oCount == 2) {
                    balloonMap[c] = balloonMap.getOrDefault(c, 0) + 1
                    oCount = 0
                }

            } else if(c == 'l') {
                lCount++
                if(lCount == 2) {
                    balloonMap[c] = balloonMap.getOrDefault(c, 0) + 1
                    lCount = 0
                }

            } else {
                balloonMap[c] = balloonMap.getOrDefault(c, 0) + 1
            }
        }
    }

    numOfBalloons = balloonMap.values.minOrNull() ?: 0

    return numOfBalloons
}