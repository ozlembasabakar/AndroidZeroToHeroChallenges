Create a program that evaluates mathematical expressions containing multiple operators and parentheses. The program must respect operator precedence and correctly handle parentheses. Use either a stack-based approach (for example Shunting Yard) or recursive parsing to evaluate the expression.

### Function Description
Implement the function `evaluateExpression(expression: String) -> String`.

- expression (string): A valid mathematical expression containing integers, operators (`+`, `-`, `*`, `/`), and parentheses.
  
The function should return:

- A string containing the result of the evaluated expression formatted as `"Result: {value}"`.

### Input Format

You do not need to handle input/output directly. Your function will be tested with the following input:

- A single string representing a mathematical expression.
  
### Constraints

- The input expression contains only valid characters: digits (`0-9`), operators (`+`, `-`, `*`, `/`), parentheses (`(`, `)`), and spaces.
  
**Sample Input 1**
```
3 + 5 * (2 - 8) / 4
```

**Sample Output 1**
```
Result: 3 5 2 8 - * 4 / +
```
**Explanation**

In Sample Input 1, the expression is evaluated respecting operator precedence.

**Sample Input 2**
```
3 + (5 - 2) / (1 - 1)
```

**Sample Output 2**
```
Result: 3 5 2 - 1 1 - / +
```
**Explanation**

In Sample Input 2, the expression is evaluated respecting operator precedence.
