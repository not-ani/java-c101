# 3-5 Keyboard input

This lesson taught me how to accept data at runtime instead of hard-coding it. `JOptionPane.showInputDialog` returns a `String` reference, even when the user enters digits. In `Input01.java`, I use `Integer.parseInt` to convert that text into a primitive `int` before adding 1. I also nest `showInputDialog` inside `parseInt` to collect and convert input in one statement.

These programs use Section 3-3 `String` data, Section 3-4 type conversion, and Section 3-5 input. They import `javax.swing.JOptionPane`, `java.io.File`, `java.io.FileNotFoundException`, and `java.util.Scanner`. In `ReadFile.java`, the reference types `File` and `Scanner` represent and read `input.txt`. `hasNextLine()` checks for another line, `nextLine()` reads it, and `close()` releases the input resource. `throws FileNotFoundException` declares the checked exception that can occur if the file is missing.
