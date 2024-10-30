# Lesson 17: OOP Principles, Part II

## Pre-work

Please review the following resources before lecture:

### Required

* [Object-oriented Programming in 7 minutes | Mosh (Video)](https://www.youtube.com/watch?v=pTB0EiLXUC8)
* [Naming Convention In Java Tutorial #77 (Video)](https://www.youtube.com/watch?v=QazDDPtSulY)

### Recommended

* [Naming Conventions - Oracle (Article)](https://www.oracle.com/java/technologies/javase/codeconventions-namingconventions.html)
* [Test-Driven Development (TDD): A Time-Tested Recipe for Quality Software (Article)](https://semaphoreci.com/blog/test-driven-development)

## Homework

- [ ] Complete [Library Management System](#library-management-system) assignment.

## Library Management System

For this assignment, you will build a library management system using object oriented principles. Pay attention to the requirements careful in order to implement your system successfully.

### Functional Requirements

* We want to define a book and keep track of its title, isbn, author(s), number of pages, and whether it is checked out or not.
* We want define a patron with properties including their name and the books they have checked out.
* We want to define a library that:
    * Allows us to add/remove a book to and from its collection of books. 
    * Allows us to register new patrons
    * Allows us to check out books to patrons.
    * Allows us to return books from patrons.

### Technical Requirements

* All of your types must be created in a unique sub-package under the `com.codedifferently.lesson17` namespace.
* Include tests for all of your classes and public methods.
* Include appropriate `javadoc` for your classes and methods. In VS Code, you can usually start a comment with `/**` and press `Enter` to let the IDE automatically create some starter text for you.

### Tips

* Read the functional requirements carefully, and take special care to identify *objects*, their *data*, and their *actions*.
* It is highly recommended that you write your tests firsts, and then build what you need to make the tests work. This is essential to [Test-Driven Development][tdd-article].
* How will you ensure that books are properly checked out using the library? What if someone tries to check out a book the library doesn't own (or vice-versa with returns)?
* What are the public methods that you need to have to get the system working? Don't make anything public that you don't need to fulfill the requirements of the assignment. For instance, adding a getter method for a book's ISBN makes sense, but adding a method for returning the library's hours of operation is beyond the scope of this assignment.
* How can you use collections to manage books and patrons? For instance, it would be wise to ensure that patrons can only be registered once based on some unique identifier.

[tdd-article]: https://semaphoreci.com/blog/test-driven-development
