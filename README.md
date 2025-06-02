# Java Object-Oriented Programming Project

This project demonstrates various concepts of object-oriented programming in Java, including class composition, inheritance, and encapsulation.

## Project Structure

The project consists of two main sets of classes:

### Geometric Classes
- **MyPoint**: Represents a point in 2D space with x and y coordinates
- **MyLine**: Represents a line between two points with methods to calculate length and gradient
- **MyRectangle**: Represents a rectangle defined by top-left and bottom-right points

### Financial Classes
- **Money**: Represents a monetary amount with dollars and cents
- **Person**: Represents a person with first name, last name, and address
- **Address**: Represents a physical address with street, city, state, and postal code
- **CreditCard**: Represents a credit card with owner, balance, and credit limit

## How to Compile and Run

To compile all Java files in the project:
```
javac *.java
```

To run the test programs:
```
java TestMyLine
java TestMyRectangle
java CreditCardDemo
```

## Class Relationships

- **TestMyLine** and **TestMyRectangle** are test drivers for MyLine and MyRectangle classes
- **CreditCardDemo** demonstrates the functionality of the CreditCard, Person, Address, and Money classes
- **MyLine** uses **MyPoint** objects to represent the beginning and end points
- **MyRectangle** uses **MyPoint** objects to represent the top-left and bottom-right corners
- **CreditCard** has a **Person** owner and **Money** objects for balance and credit limit
- **Person** has an **Address** object for the person's location

## Features

- Geometric calculations (distance, area, perimeter)
- Financial operations (add, subtract, compare money amounts)
- Address and person management
- Credit card functionality (charging, payments, credit limit management)
