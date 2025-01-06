import { Todo } from '@/models';
import { TodoApp } from './todo-app';

describe('<TodoApp />', () => {
  it('renders', () => {
    // Arrange
    cy.intercept('GET', '/api/todos', {
      body: [
        { id: 1, text: 'Todo 1', completed: false },
        { id: 2, text: 'Todo 2', completed: true },
      ] as Todo[],
    });

    // Act
    cy.mount(<TodoApp />);

    // Assert
    cy.get('h1').should('have.text', 'Todo App');
    cy.get('.todo').should('have.length', 2);
    cy.compareSnapshot('todo-app', {
      errorThreshold: 0.1,
    });
  });
});
