# Elevate Internship – Java Console Calculator 🧮

**Task:** Java console-based calculator  
**Repository:** `Elevate-Internship` under `main` by **ankitv26**

---

## 📌 Overview

This project implements a simple but robust Java console calculator.  
It supports basic arithmetic operations and demonstrates clean code practices and command-line interaction.

---

## 🚀 Features

- Addition (`+`), Subtraction (`-`), Multiplication (`*`), Division (`/`)
- Input validation and error handling (e.g., division by zero, invalid numbers)
- Looping interface: perform multiple calculations until the user exits

---

## 📋 Usage

### Clone the repo

```bash
git clone https://github.com/ankitv26/Elevate-Internship.git
cd "Elevate-Internship/Task 1 Java Console Calculator"
```

## Compile and Run
 
   ```bash
    javac CalculatorApp.java
    java CalculatorApp 
```


## 🔍 Code Overview
### 📂 Calculator.java

    This class defines the calculator's core logic. It contains methods for:

    - add(double, double) — returns the sum

    - sub(double, double) — returns the difference

    - mul(double, double) — returns the product

    - div(double, double) — safely handles division; throws an exception if dividing by zero

 ## 📂 CalculatorApp.java

    This is the main application class that:

    Uses a Scanner to take user input

    Loops through operations until the user decides to quit

    Uses a switch statement to choose the appropriate operation

    Handles errors using try-catch (e.g., invalid operators, division by zero)

  ## 🧪 Example logic:
```java
    char operation = scanner.next().charAt(0);
    switch (operation) {
    case '+': result = calculator.add(num1, num2); break;
    case '-': result = calculator.sub(num1, num2); break;
    case '*': result = calculator.mul(num1, num2); break;
    case '/': result = calculator.div(num1, num2); break;
    default: System.out.println("Enter valid operation");
    }
 ```

 ## ✅ Sample Output
   
    Enter num1 : 12
    + Enter Operation ( + , - , * , / ) : *
    Enter num2 : 4
    Result : 48.0
    Continue (yes/no) : no
+ Thank you for using Calculator
   
