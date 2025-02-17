fun evaluateExpression(expression: String): String {

    val output = java.util.ArrayDeque<String>()
    val operatorStack = java.util.ArrayDeque<String>()

    val precedence = mapOf("+" to 1, "-" to 1, "*" to 2, "/" to 2, "^" to 3)
    val isRightAssociative = { op: String -> op == "^" }

    val tokens = Regex("""\d+(\.\d+)?|[+\-*/^()]""")
        .findAll(expression.replace("\\s".toRegex(), ""))
        .map { it.value }
        .toList()

    tokens.forEach { token ->
        when {
            token.matches(Regex("""\d+(\.\d+)?""")) -> {
                output.add(token)
            }
            token in precedence.keys -> {
                while (operatorStack.isNotEmpty() && operatorStack.last() != "(" &&
                    (precedence[token]!! < precedence[operatorStack.last()]!! ||
                            (precedence[token]!! == precedence[operatorStack.last()]!! && !isRightAssociative(token)))
                ) {
                    output.add(operatorStack.removeLast())
                }
                operatorStack.addLast(token)
            }
            token == "(" -> {
                operatorStack.addLast(token)
            }
            token == ")" -> {
                while (operatorStack.isNotEmpty() && operatorStack.last() != "(") {
                    output.add(operatorStack.removeLast())
                }
                if (operatorStack.isNotEmpty() && operatorStack.last() == "(") {
                    operatorStack.removeLast()
                }
            }
        }
    }

    while (operatorStack.isNotEmpty()) {
        output.add(operatorStack.removeLast())
    }

    return "Result: ${output.joinToString(" ")}"
}