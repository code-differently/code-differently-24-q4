import './CreateProgram.scss';
import React, {useState} from 'react';
import { useNavigate } from 'react-router-dom';
import {API_BASE_URL} from '../../components/constants'

type ProgramData = {
    title : string;
    description : string;
}

export const CreateProgram: React.FC = () => {
  const [title, setTitle] = useState('');
  const [description, setDescription] = useState('');
  const navigate = useNavigate();

  const handleSubmit = async (e: React.FormEvent) => {
    e.preventDefault();

    const newProgram: ProgramData = {title, description};

    try {
      const response = await fetch(API_BASE_URL, {
        method: 'POST',
        headers: {'Content-Type': 'application/json'},
        body: JSON.stringify(newProgram),
      });
      console.log('New program added');

      navigate("/");
    } catch (error) {
      console.error('Error adding program:', error);
      alert('There was an error adding the program. Please try again.');
    }
  };

  return (
    <div className="form-container">
    <h1 className="form-title">Add New Program</h1>
      <form onSubmit={handleSubmit}>
         <div className="form-group">
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

        <div className="form-group">
          <label htmlFor="description">Description</label>
          <textarea rows={6}
            id="description"
            name="description"
            placeholder="Program description"
            value={description}
            onChange={e => setDescription(e.target.value)}
            required
          >
          </textarea>
        </div>
        <button type="submit" className="submit-btn">Submit</button>
      </form>
    </div>
  );
};


