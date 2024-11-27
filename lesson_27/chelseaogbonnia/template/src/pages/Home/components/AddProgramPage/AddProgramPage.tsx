import {Program} from '@code-differently/types';
import React, {useState} from 'react';

const addProgram = async (newProgram: Program): Promise<Program> => {
  const res = await fetch('http://localhost:4000/programs', {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json',
    },
    body: JSON.stringify(newProgram),
  });

  if (!res.ok) {
    throw new Error('Failed to add program');
  }

  return res.json();
};

const AddProgramPage: React.FC = () => {
  const [title, setTitle] = useState('');
  const [description, setDescription] = useState('');
  const [isLoading, setIsLoading] = useState(false);
  const [isError, setIsError] = useState(false);
  const [isSuccess, setIsSuccess] = useState(false);

  const handleSubmit = async (e: React.FormEvent) => {
    e.preventDefault();
    setIsLoading(true);
    setIsError(false);
    setIsSuccess(false);

    try {
      await addProgram({id: '', title, description});
      setIsSuccess(true);
    } catch (error) {
      setIsError(true);
      console.error('Error adding program:', error);
    } finally {
      setIsLoading(false);
    }
  };

  return (
    <div>
      <h2>Add New Program</h2>
      <form onSubmit={handleSubmit}>
        <input
          type="text"
          value={title}
          onChange={e => setTitle(e.target.value)}
          placeholder="Program Title"
          required
        />
        <textarea
          value={description}
          onChange={e => setDescription(e.target.value)}
          placeholder="Program Description"
          required
        />
        <button type="submit" disabled={isLoading}>
          {isLoading ? 'Adding...' : 'Add Program'}
        </button>
      </form>

      {isError && <p>Error adding program</p>}
      {isSuccess && <p>Program added successfully!</p>}
    </div>
  );
};

export default AddProgramPage;
