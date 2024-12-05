import React, {useState} from 'react';
import {useNavigate} from 'react-router-dom';
import './CreateProgram.scss';

interface ProgramData {
  title: string;
  description: string;
}

export const CreateProgram: React.FC = () => {
  const [title, setTitle] = useState('');
  const [description, setDescription] = useState('');
  const navigate = useNavigate();

  const handleSubmit = async (e: React.FormEvent) => {
    e.preventDefault();

    const newProgram: ProgramData = {title, description};

    try {
      const response = await fetch('http://localhost:4000/programs', {
        method: 'POST',
        headers: {'Content-Type': 'application/json'},
        body: JSON.stringify(newProgram),
      });

      if (!response.ok) {
        throw new Error('Failed to add new program');
      }

      console.log('New program added:', await response.json());

      navigate('/'); 
    } catch (error) {
      console.error('Error adding program:', error);
      alert('There was an error adding the program. Please try again.');
    }
  };

  return (
    <div className="create-program">
      <h2>Have a new program to share?</h2>
      <p>Fill out the form below and see it on the homepage!</p>
      <form onSubmit={handleSubmit}>
        <div>
          <label htmlFor="title">Title</label>
          <input
            type="text"
            id="title"
            name="title"
            placeholder="Program title"
            value={title}
            onChange={e => setTitle(e.target.value)}
            required
          />
        </div>

        <div>
          <label htmlFor="description">Description</label>
          <textarea
            id="description"
            name="description"
            placeholder="About this program"
            value={description}
            onChange={e => setDescription(e.target.value)}
            required
          ></textarea>
        </div>

        <button type="submit">Add Program</button>
      </form>
    </div>
  );
};
