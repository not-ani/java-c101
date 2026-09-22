# 3-2 Numeric data

This lesson taught me that Java uses the operands' data types to evaluate an expression. `byte`, `short`, `int`, and `long` store integers, while `float` and `double` store floating-point values. I used `int` for chicken and egg counts, then `double` for averages and profit.

In `Chickens01.java`, I use `*` for multiplication, `++` to increment the chicken count, `+=` to accumulate eggs, and `/=` to divide the count. Since the variables are `int`, division truncates any decimal remainder. In `Chickens02.java`, parentheses make Java add the daily totals before dividing. The `3.0` operand forces floating-point division, so the average keeps its decimal value. This showed me that operator precedence and operand types control the result, even when the result is assigned to a `double`.
