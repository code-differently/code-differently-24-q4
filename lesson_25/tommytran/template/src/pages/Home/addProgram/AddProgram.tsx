import './AddProgram.scss';
import React, {useState} from 'react';
import {useNavigate, useOutletContext} from 'react-router-dom';

const AddProgram: React.FC = () => {
  const {addProgram} = useOutletContext<{
    addProgram: (newProgram: {title: string; description: string}) => void;
  }>();
  const [title, setTitle] = useState('');
  const [description, setDescription] = useState('');
  const navigate = useNavigate();

  const handleSubmit = (e: React.FormEvent) => {
    e.preventDefault();

    addProgram({title, description});

    console.log('New Program: ', {title, description});

    navigate('/');
  };
  return (
    <div className="add-program">
      <h2>Add a New Program</h2>
      <form onSubmit={handleSubmit}>
        <div>
          <label htmlFor="title">Title:</label>
          <input
            id="title"
            type="text"
            value={title}
            onChange={e => setTitle(e.target.value)}
            required
          />
        </div>
        <div>
          <label htmlFor="description">Description:</label>
          <textarea
            id="description"
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

export default AddProgram;
