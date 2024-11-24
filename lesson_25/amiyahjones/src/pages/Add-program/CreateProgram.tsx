import React from 'react';

export const CreateProgram: React.FC = () => {
  return (
        <>
        <h2>Have a new program to share?</h2>
        <p>fill out the form below and see it on the home webpage!</p>
        <form action="/program" method="POST">
            <label htmlFor="title">Title</label>
            <input type="text" id="title" name="title" placeholder="program title" required></input>

            <label htmlFor="description">Description</label>
            <textarea id="description" name="description" placeholder='about this program'></textarea>
        </form>
        </>
    );
  };