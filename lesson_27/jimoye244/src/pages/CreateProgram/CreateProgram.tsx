import './CreateProgram.scss';
import React from 'react';

export const CreateProgram: React.FC = () => {
    return (

      <div className="form-container">
      <h1 className="form-title">Add New Program</h1>

      <form  className="form">
        <div className="form-group">
          <label htmlFor="title">Title</label>
          <input
            type="text"
            id="title"
            name="title"
          />
        </div>

        <div className="form-group">
          <label htmlFor="description">Description</label>
          <textarea
            id="description"
            name="description"
          ></textarea>
        </div>

        <button type="submit" className="submit-btn">Submit</button>
      </form>
    </div>
    );
};