import {Program} from '@code-differently/types';
import {useMutation} from '@tanstack/react-query';
import React, {useState} from 'react';

const addProgram = async (newProgram: Program): Promise<Program> => {
  const res = await fetch('http://localhost:4000/programs', {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json',
    },
    body: JSON.stringify(newProgram), // Sending title and description
  });

  if (!res.ok) {
    throw new Error('Failed to add program');
  }

  return res.json(); // Return the new program data after it's added
};

const AddProgramPage: React.FC = () => {
  const [title, setTitle] = useState('');
  const [description, setDescription] = useState('');
  const mutation = useMutation<Program, Error, Program>(addProgram);

  const handleSubmit = (e: React.FormEvent) => {
    e.preventDefault();
    mutation.mutate({title, description}); // No need to include id
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
        <button type="submit" disabled={mutation.isLoading}>
          {mutation.isLoading ? 'Adding...' : 'Add Program'}
        </button>
      </form>

      {mutation.isError && <p>Error adding program</p>}
      {mutation.isSuccess && <p>Program added successfully!</p>}
    </div>
  );
};

export default AddProgramPage;
