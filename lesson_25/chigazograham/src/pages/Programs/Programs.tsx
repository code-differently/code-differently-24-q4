import './Programs.scss';
import React, {useState} from 'react';

export const Programs: React.FC = () => {
    const [title, setTitle] = useState<string>('');
    const [description, setDescription] = useState<string>('');

    const handleSubmit = (e: React.FormEvent) => {
      e.preventDefault();
      console.log('Program Title:', title);
      console.log('Program Description:', description);
    };

  return (
   <div className="new-program-page">
      <h1>New Program Form</h1>
      <form className="program-form" onSubmit={handleSubmit}>
        <div className="form-group">
          <label htmlFor="title">Program Title:</label>
          <input
            type="text"
            id="title"
            value={title}
            onChange={(e) => setTitle(e.target.value)}
            placeholder="Enter the program title"
            required
          />
        </div>
        <div className="form-group">
          <label htmlFor="description">Program Description:</label>
          <textarea
            id="description"
            value={description}
            onChange={(e) => setDescription(e.target.value)}
            placeholder="Enter program description"
            required
          />
        </div>
        <button type="submit" className="submit-button">Submit</button>
      </form>
    </div>
  );
};