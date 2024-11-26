Write a program that takes two numbers and an operator as input and performs a basic arithmetic operation based on the provided operator. 
If the operator is invalid or the user attempts to divide by zero, your program should handle the error gracefully and return appropriate error messages.

### Function Description

Implement the function `calculate(a: Float, b: Float, operator: String) -> String`.

- `a` (float): The first operand.

- `b` (float): The second operand.

- `operator` (string): A string representing the operation (`+`, `-`, `*`, `/`).

The function should return:

- A string containing the result of the operation formatted as `"Result: {value}"`.

- If the operator is invalid, return `"Error: Invalid operator"`.

- If the operation involves division by zero, return `"Error: Division by zero"`.

### Input Format

You do not need to handle input/output directly. Your function will be tested with the following inputs:

- Two floating-point numbers `a` and `b`.

- A string `operator` representing the operation.

### Constraints

`a` and `b` are floating-point numbers in the range `[-10^3, 10^3]`.

Valid operators are `+`, `-`, `*`, `/`.

**Sample Input 1**
```
a = 10.0  
b = 5.0  
operator = "+"
```

**Sample Output 1**
```
Result: 15.0
```

**Explanation**

In Sample Input 1, the valid operator `+` adds `10.0` and `5.0`, resulting in `15.0`.

**Sample Input 2**
```
a = 10.0  
b = 0.0  
operator = "/"
```

**Sample Output 2**
```
Error: Division by zero
```

**Explanation**

In Sample Input 2, division by zero is not allowed, so an error message is returned.
