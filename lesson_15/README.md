# Lesson 15: Test Driven Development

## Pre-work

Please review the following resources before lecture:

* [Test-Driven Development (TDD): A Time-Tested Recipe for Quality Software (Article)](https://semaphoreci.com/blog/test-driven-development)
* [Test-Driven Development explained in 3 minutes (Video)](https://www.youtube.com/watch?v=amkDB_oPix0)

## Homework

- [ ] Complete [Unit Testing](#unit-testing) assignment.
- [ ] Do pre-work for [lesson 16](/lesson_16/).

### Unit Testing

For the code in the Lesson 15 app, you will write tests in the [unit tests project][unit-tests-link]. You must write *at least* 5 tests for each of the `Employee` and `EmployeeManager` classes (10 tests minimum). Each class must have it's own corresponding test file.

In addition to writing unit tests, you will need to implement a new method on the `Employee` class called `getDetails` that returns a string describing the employee using the Test-Driven Development methodology.

[unit-tests-link]: ./tdd/tdd_app/src/test/java/com/codedifferently/lesson15/