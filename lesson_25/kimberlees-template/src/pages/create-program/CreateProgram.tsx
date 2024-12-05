import './CreateProgram.scss';
import React, {useState} from 'react';

const CreateProgram: React.FC = () => {
  const [title, setTitle] = useState('');
  const [description, setDescription] = useState('');


  const handleSubmit = (e: React.FormEvent) => {
    e.preventDefault();
    
    const newProgram = {title, description};
    console.log('New Program:', newProgram);

    setTitle('');
    setDescription('');
   
  };

  return (
    <div className="create-program">
      <h1>Create a New Program</h1>
      <form onSubmit={handleSubmit}>
        <div className="form-group">
          <label htmlFor="title">Program Title</label>
          <input
            type="text"
            id="title"
            value={title}
            onChange={e => setTitle(e.target.value)}
            placeholder="Enter program title"
            required
          />
        </div>

        <div className="form-group">
          <label htmlFor="description">Program Description</label>
          <textarea
            id="description"
            value={description}
            onChange={e => setDescription(e.target.value)}
            placeholder="Enter program description"
            required
          />
        </div>

        <button type="submit" className="add-button">Add Program</button>
      </form>
    </div>
  );
};

export default CreateProgram;
