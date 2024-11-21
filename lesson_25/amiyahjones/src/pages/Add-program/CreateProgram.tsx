import React from 'react';
import { BrowserRouter } from 'react-router-dom';

export const CreateProgram: React.FC = () => {
  return (
        <>
        <BrowserRouter>
        <h2>Have a new program to share?</h2>
        <p>fill out the form below and see it on the home webpage!</p>
        <form action="/" method="POST">
            <label htmlFor="title">Title</label>
            <input type="text" id="title" name="title" placeholder="program title" required></input>

            <label htmlFor="description">Description</label>
            <textarea id="description" name="description" placeholder='about this program'></textarea>
        </form>
        </BrowserRouter>
        </>
    );
  };