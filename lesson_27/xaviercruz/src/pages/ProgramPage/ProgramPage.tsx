import {Program} from '@code-differently/types';
import {useState} from 'react';
import {useNavigate} from 'react-router-dom';

export const ProgramPage: React.FC = () => {
  const navigate = useNavigate();
  const [formData, setFormData] = useState<Program>({
    id: '',
    title: '',
    description: '',
  });

  const handleSubmit = async (e: React.FormEvent) => {
    e.preventDefault();

    if (!formData.title || !formData.description) {
      alert('Please fill in all fields');
      return;
    }

    try {
      const response = await fetch('http://localhost:4000/programs', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json',
        },
        body: JSON.stringify({
          title: formData.title,
          description: formData.description,
        }),
      });

      if (!response.ok) {
        throw new Error('Failed to save program');
      }

      navigate('/');
    } catch (error) {
      window.console.log('Error submitting program:', error);
      alert('An error occurred while saving the program. Please try again.');
    }
  };

  const handleChange = (
    e: React.ChangeEvent<HTMLInputElement | HTMLTextAreaElement>
  ) => {
    const {name, value} = e.target;
    setFormData(prev => ({...prev, [name]: value}));
  };

  return (
    <form method="post" id="add-program-form" onSubmit={handleSubmit}>
      <p>
        <span>Title</span>
        <input
          placeholder="Title"
          aria-label="Program Title"
          type="text"
          name="title"
          value={formData.title}
          onChange={handleChange}
          required
        />
        <label htmlFor="Description">Description</label>
        <textarea
          rows={3}
          cols={85}
          minLength={100}
          name="description"
          title="Description"
          className="textarea"
          required
          style={{resize: 'none'}}
        />
      </p>
      <p>
        <button type="submit">Save</button>
        <button type="button" onClick={() => navigate('/')}>
          Cancel
        </button>
      </p>
    </form>
  );
};
