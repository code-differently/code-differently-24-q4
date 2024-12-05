import React, {useState} from 'react';

interface AddProgramProps {
  addProgram: (program: {title: string; description: string}) => void;
}

const AddProgram: React.FC<AddProgramProps> = ({addProgram}) => {
  const [title, setTitle] = useState('');
  const [description, setDescription] = useState('');

  const handleSubmit = (event: React.FormEvent) => {
    event.preventDefault();
    addProgram({title, description});
    setTitle('');
    setDescription('');
  };

  return (
    <section className="add-program">
      <h2>Add a New Program</h2>
      <form onSubmit={handleSubmit}>
        <div>
          <label htmlFor="title">Program Title:</label>
          <input
            type="text"
            id="title"
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
    </section>
  );
};

export default AddProgram;
