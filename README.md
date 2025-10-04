# Simple-Compound-Interest-Calculator

A simple command-line application written in Java to calculate compound interest.

## Overview

This project provides a basic calculator that determines the final amount of an investment based on the principal amount, annual interest rate, number of times the interest is compounded per year, and the number of years. The user is prompted to enter these values, and the application calculates and displays the final amount.

## Features

-   Calculates compound interest based on user inputs.
-   Interactive command-line interface.
-   Accepts principal, annual rate, compounding frequency, and duration in years.
-   Formats the final amount with commas and as a whole number.

## Prerequisites

To compile and run this project, you need to have the Java Development Kit (JDK) installed on your system.

## How to Get Started

1.  **Clone the repository:**
    ```sh
    git clone https://github.com/nafizimtiazemu/Simple-Compound-Interest-Calculator.git
    ```

2.  **Navigate to the project directory:**
    ```sh
    cd Simple-Compound-Interest-Calculator
    ```

3.  **Compile the Java code:**
    From the root directory of the project, run the following command to compile the source file:
    ```sh
    javac src/Calculator/CompoundInterestCalc.java
    ```

4.  **Run the application:**
    Execute the compiled class using the following command. The program will then prompt you for input.
    ```sh
    java -cp src Calculator.CompoundInterestCalc
    ```

## Usage Example

After running the application, you will be prompted to enter the required information.

```
Enter principle amount: 10000
Enter annual interest rate(in %): 7.5
Enter number of compounds per years: 4
Enter number of years: 15
Final amount = $30,332
```

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
