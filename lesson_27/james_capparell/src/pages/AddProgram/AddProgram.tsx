import './AddProgram.scss';
import React from 'react';
import { useState } from 'react';


export const AddProgram: React.FC = () => {
  const [title, setTitle] = useState('');
  const [description, setDescription] = useState('');

  const handleSubmit = (event: { preventDefault: () => void; }) => {
    event.preventDefault();
    const newProgram = { title, description };

    fetch('http://localhost:4000/api/programs', {  // Adjust API endpoint
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify(newProgram),
    })
      .then(response => response.json())
      .then(data => console.log('New program added:', data))
      .catch(error => console.error('Error adding program:', error));
  };
  return (
    <div className="add-program">
      <h1>Add New Program</h1>
        <form onSubmit={handleSubmit}>
          <div>
              <label>Title</label>
              <input
                type="text"
                name="title"
                value={title}
                onChange={(e) => setTitle(e.target.value)}
                required
              />
          </div>
          <div>
            <label>Description</label>
            <input
              type="text"
              name="description"
              value={description}
              onChange={(e) => setDescription(e.target.value)}
              required
            />
          </div>
          <button type="submit">Submit</button>
        </form>
    </div>
    );
};