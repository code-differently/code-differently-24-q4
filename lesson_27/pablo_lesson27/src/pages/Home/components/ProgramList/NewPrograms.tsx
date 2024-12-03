import React, {useState} from 'react';
import {Link} from 'react-router-dom';

const NewPrograms = () => {
  const [id, setId] = useState('');
  const [title, setTitle] = useState('');
  const [description, setDescription] = useState('');

  const ProgramSubmission = (e: React.FormEvent) => {
    e.preventDefault();

    const formData = {id, title, description};

    fetch('http://localhost:4000/programs', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify(formData),
    })
      .then(res => res.json())
      .then(data => {
        setId('');
        setTitle('');
        setDescription('');
        console.log(data);
      })
      .catch(error => console.log('ERROR', error));
  };

  return (
    <>
      <form onSubmit={ProgramSubmission}>
        <h1>Submission page</h1>
        <input
          required
          value={title}
          onChange={e => setTitle(e.target.value)}
          name="title"
          id="title"
          placeholder="please enter a title"
        />
        <input
          required
          value={description}
          onChange={e => setDescription(e.target.value)}
          name="description"
          id="description"
          placeholder="please enter a description"
        />
        <button type="submit">Submit Your Recommendation</button>
      </form>
      <Link to="/">
        <button>Go back?</button>
      </Link>
    </>
  );
};

export default NewPrograms;
