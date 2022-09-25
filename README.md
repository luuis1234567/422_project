# 422_project
Topic 3: An electrical calculator
This software simulates a calculator that is capable of commonly used
computations, including but not limited to basic arithmetic calculations.
Computing with real numbers needs to be supported, allowing users to control
the level of precision desired (e.g., precise up to four decimal places). Some
advanced computations could also be supported, such as power, root, triangular
calculations, and so on.

**Team members:** 
Yi Chou, 
Mingze Hu, 
Ricardo Cahue,
Luke Martinez,
Mohammed

## Program documentation:

**The calculator engine support:**
- whole and rational numbers
- binary operators: + , - , * , / , ^
- brackets
- operator precedence

**Calculator UI buttons:**

- integers from 0-9
- mathematical operations:

	For now, our program support binary operators, so placing an operator
	" +, -, /, etc" before a single number - unary operators - is not supported, so that
	will just result in clearing the whole user input.

	1) Addition **'+'**
	2) Subtraction **''**
	3) Multiplication **'*'**
	4) Division **'/'**
	5) Power **'^'**

- Parenthesis 
	1) Left bracket **'('**
	2) Right bracket **')'**

- Decimal point **'.'**
- Delete **'<'**

	It deletes the last character of the user input text.
  
	*Pre-condition:* at least one character is on the user input field.
	Otherwise, it would clear the whole user input to start again.

- Clear **'C'**

	It clears the whole user input.

- Equal **'='**

	It evaluates the entered expression by the user ( if it is evaluable ).
	Otherwise, it would clear the whole user input to start again.
