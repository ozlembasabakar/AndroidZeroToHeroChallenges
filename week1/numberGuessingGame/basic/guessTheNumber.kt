fun guessNumber(): String {
    val randomNumber = (1..100).random()
    var attempts = 10
    var guessCount = 1

    println("Welcome to the Number Guessing Game!")
    println("I have chosen a number between 1 and 100. You have 10 attempts to guess it.")

    while (attempts > 0) {
        print("Enter your ${guessCount}. guess: ")
        val userInput = readln().trim()

        if (userInput.isBlank() || userInput.toIntOrNull() == null || userInput.toInt() !in 1..100) {
            println("Please enter a valid number between 1 and 100.")
            continue
        }

        val userGuess = userInput.toInt()
        val result = when {
            userGuess == randomNumber -> "You win! The number was $randomNumber."
            attempts == 1 -> "You lose! The number was $randomNumber."
            userGuess > randomNumber -> "Too high!"
            else -> "Too low!"
        }

        attempts -= 1
        guessCount++
        println(result)

        if (result.contains("$randomNumber")) break
    }

    return "Thanks for playing!"
}
