# Restaurant project

This program asks for a restaurant's details, stores them in a `Restaurant` object, adds that object to an `ArrayList`, and prints the result.

## What I learned from the new requirements

- **Name field and constructor:** I added a name to the restaurant's data and made the constructor accept it. That way, a new `Restaurant` has its name when it is created.
- **Private fields, getters, and setters:** I made the fields private so other classes use methods to read or change them. Each getter returns one field, and each setter updates one field.
- **User input:** `Main` uses a `Scanner` to ask for every field. Each prompt includes an example so the person running the program knows what to type.
- **Creating a restaurant:** After reading the answers, `Main` passes them to the `Restaurant` constructor. The object then contains the user's answers instead of fixed sample values.
- **ArrayList:** `Main` creates an `ArrayList<Restaurant>` and adds the new restaurant to it. A list lets the program keep restaurant objects together and could hold more later.
- **`toString()`:** The `Restaurant` class puts each field on a labeled line. Printing a restaurant uses this method, so the output is easy to read.

## Run

From this folder, run `javac Main.java Restaurant.java` and then `java Main`.
