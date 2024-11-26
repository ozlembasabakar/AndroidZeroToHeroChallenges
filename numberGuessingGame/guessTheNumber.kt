const val NUM_DIGITS = 4
const val MAX_GUESSES = 10

fun getSecretNum(): String {
    return (0..9).toList().shuffled().take(NUM_DIGITS).joinToString("")
}

fun getClues(guess: String, secretNum: String): String {
    if (guess == secretNum) return "You got it!"

    val clues = mutableListOf<String>()
    val matchedIndices = mutableSetOf<Int>()

    guess.forEachIndexed { index, char ->
        if (char == secretNum[index]) {
            clues.add("+")
            matchedIndices.add(index)
        }
    }

    guess.forEachIndexed { index, char ->
        if (char in secretNum && char != secretNum[index]) {
            val unmatchedIndex = secretNum.indexOfFirst { it == char && it != secretNum[index] && !matchedIndices.contains(secretNum.indexOf(it)) }
            if (unmatchedIndex != -1) {
                clues.add("-")
                matchedIndices.add(unmatchedIndex)
            }
        }
    }

    return if (clues.isEmpty()) "" else clues.sorted().joinToString("")
}


fun guessTheNumber(): String {
    while (true) {
        val secretNum = getSecretNum()
        println("I have thought up a number. You have $MAX_GUESSES guesses to figure it out.")

        var numGuesses = 0

        while (numGuesses < MAX_GUESSES) {
            print("Guess #${numGuesses + 1}: ")
            val guess = readln().trim()

            if (guess.length != NUM_DIGITS || !guess.all { it.isDigit() }) {
                println("Invalid input. Please enter a $NUM_DIGITS-digit number.")
                continue
            }

            val clues = getClues(guess, secretNum)
            println(clues)

            if (guess == secretNum) {
                println("Congratulations! You've guessed the number!")
                break
            }

            numGuesses++
            if (numGuesses == MAX_GUESSES) {
                println("Out of guesses! The correct number was $secretNum.")
            }
        }

        print("\nDo you want to play again? (yes or no)")
        val playAgain = readln().lowercase()
        if (!playAgain.startsWith('y')) {
            break
        }
    }
    return "\nThanks for playing!"
}
