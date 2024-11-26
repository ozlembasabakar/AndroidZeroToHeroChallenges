fun calculate(a: Float, b: Float, operator: String): String {

    val result = when (operator) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> if (b != 0f) a / b else {
            return "Error: Division by zero is not allowed."
        }

        else -> {
            return "Error: Invalid operator. Please use +, -, *, or /."

        }
    }

    return "Result: $result"
}
